/*Copyright ©2016 TommyLemon(https://github.com/TommyLemon/APIJSON)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package zuo.biao.apijson.server;

import java.util.List;
import java.util.Map;

import zuo.biao.apijson.RequestMethod;
import zuo.biao.apijson.RequestRole;
import zuo.biao.apijson.server.AbstractSQLConfig.Callback;

/**SQL配置
 * @author Lemon
 */
public interface SQLConfig {

	String SCHEMA_INFORMATION = "`information_schema`";
	String TABLE_SCHEMA = "`table_schema`";
	String TABLE_NAME = "`table_name`";
	
	public static final int TYPE_CHILD = 0;
	public static final int TYPE_ITEM = 1;
	public static final int TYPE_ITEM_CHILD_0 = 2;
	
	/**获取数据库地址
	 * @return
	 */
	String getDBUri();
	
	/**获取数据库账号
	 * @return
	 */
	String getDBAccount();
	
	/**获取数据库密码
	 * @return
	 */
	String getDBPassword();

	/**获取SQL语句
	 * @return
	 * @throws Exception
	 */
	String getSQL(boolean prepared) throws Exception;


	
	boolean isTest();
	SQLConfig setTest(boolean test);

	boolean isCacheStatic();
	SQLConfig setCacheStatic(boolean cacheStatic);


	int getType();
	SQLConfig setType(int type);
	
	int getCount();
	SQLConfig setCount(int count);
	
	int getPage();
	SQLConfig setPage(int page);
	
	int getQuery();
	SQLConfig setQuery(int query);

	int getPosition();
	SQLConfig setPosition(int position);

	
	
	
	RequestMethod getMethod();
	SQLConfig setMethod(RequestMethod method);
	
	long getId();
	SQLConfig setId(long id);

	RequestRole getRole();
	SQLConfig setRole(RequestRole role);

	String getSchema();
	SQLConfig setSchema(String schema);
	
	/**请求传进来的Table名
	 * @return
	 * @see {@link #getSQLTable()}
	 */
	String getTable();
	/**数据库里的真实Table名
	 * 通过 {@link #TABLE_KEY_MAP} 映射
	 * @return
	 */
	String getSQLTable();
	
	String getTablePath();
	
	SQLConfig setTable(String table);

	String getGroup();
	SQLConfig setGroup(String group);

	String getHaving();
	SQLConfig setHaving(String having);
	
	String getOrder();
	SQLConfig setOrder(String order);

	String getColumn();
	SQLConfig setColumn(String column);

	String getValues();
	SQLConfig setValues(String values);

	Map<String, Object> getContent();
	SQLConfig setContent(Map<String, Object> content);



	Map<String, Object> getWhere();
	SQLConfig setWhere(Map<String, Object> where);
	
	Map<String, List<String>> getCombine();
	SQLConfig setCombine(Map<String, List<String>> combine);
	

	
	/**
	 * exactMatch = false
	 * @param key
	 * @return
	 */
	Object getWhere(String key);
	/**
	 * @param key
	 * @param exactMatch
	 * @return
	 */
	Object getWhere(String key, boolean exactMatch);
	/**
	 * @param key
	 * @param value
	 * @return
	 */
	SQLConfig putWhere(String key, Object value);
	
	
	boolean isPrepared();
	
	AbstractSQLConfig setPrepared(boolean prepared);
	
	boolean isMain();

	AbstractSQLConfig setMain(boolean main);

	
	List<Object> getPreparedValueList();

	List<Join> getJoinList();

	SQLConfig setJoinList(List<Join> joinList);

	String getAlias();

	AbstractSQLConfig setAlias(String alias);




}
