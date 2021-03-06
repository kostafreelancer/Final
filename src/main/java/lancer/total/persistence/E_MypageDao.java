package lancer.total.persistence;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lancer.e_mypage.domain.Enterprise;



@Repository
public class E_MypageDao{

	@Inject
	private SqlSession session;
	
	private static String namespace = "lancer.mappers.e_mypageMapper";
	
	public Enterprise selectEnterprise(int e_num) throws Exception {
		return session.selectOne(namespace+".selectEnterprise", e_num);
	}
	
	public void updateEnterprise(Enterprise enterprise) throws Exception {
		session.update(namespace+".updateEnterprise", enterprise);
	}
	
	/*

	
	public List<Project> listProjectReady(int e_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).listProjectReady(e_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Project> listProjectDoing(int e_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).listProjectDoing(e_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	public List<Project> listProjectDone(int e_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).listProjectDone(e_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public Project selectProject(HashMap<String, Integer> map){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).selectProject(map);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	
	public List<Integer> selectP_job(int e_pr_num){
		SqlSession session = getSqlSessionFactory().openSession();
		try {
			return session.getMapper(E_MypageMapper.class).selectP_job(e_pr_num);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
	*/
	
	/*@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace+".create", vo);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception {
		return session.selectOne(namespace+".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(namespace + ".delete", bno);
	}
	// ,cri, new RowBounds(cri.getPageStart(), cri.getPerPageNum())

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".listAll", null, new RowBounds(cri.getPageStart(), cri.getPerPageNum()));
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {
		return session.selectList(namespace + ".listSearch", cri, new RowBounds(cri.getPageStart(), cri.getPerPageNum()));
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public void updateReplyCnt(Integer bno, int amount) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("bno", bno);
		paramMap.put("amount", amount);
		
		session.update(namespace + ".updateReplyCnt", paramMap);
	}

	@Override
	public void updateViewCnt(Integer bno) throws Exception {
		session.update(namespace+".updateViewCnt", bno);
	}

	@Override
	public void addAttach(FileVO vo) throws Exception {
		session.insert(namespace+".addAttach", vo);
	}

	@Override
	public int maxNum() throws Exception {
		return session.selectOne(namespace+".maxNum");
	}

	@Override
	public List<String> getAttach(Integer bno) throws Exception {
		return session.selectList(namespace + ".getAttach", bno);
	}

	@Override
	public void deleteAttach(Integer bno) throws Exception {
		session.delete(namespace+".deleteAttach", bno);
	}

	@Override
	public void replaceAttach(String fullName, Integer bno) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("bno", bno);
		paramMap.put("fullname", fullName);
		
		session.insert(namespace+".replaceAttach", paramMap);
	}*/

}
