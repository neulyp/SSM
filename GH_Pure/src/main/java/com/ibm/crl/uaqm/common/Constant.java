package com.ibm.crl.uaqm.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.ibm.crl.uaqm.common.util.ModelUtil;

public class Constant {
	public static String PROJECT_NAME="UAQM";
	public static double EXCEPTION_VALUE=-999;
	public static int AREA_LEVEL_PROVINCE=1;
	public static int AREA_LEVEL_MUNICIPALITY=2;
	public static int AREA_LEVEL_CITY=3;
	public static String SECURITY_KEY="br1sjhhrhl";	
	
	public static String PA="PA";//污染实测数据
	public static String PF_SITE="PF_SITE";//污染预测格网点数据
	public static String PF_GRID="PF_GRID";//污染预测格网点数据
	public static String PF_RMSE="PF_RMSE";//污染预测精度误差数据
	public static String WA="WA";//实测数据
	public static String WF_SITE="WF_SITE";//污染预测格网点数据
	public static String WF_GRID="WF_GRID";//污染预测格网点数据
	public static String WPF_GRID="WPF_GRID";//污染预测格网点数据
	
	public static String SUCCESS="SUCCESS";//日志成功状态
	public static String FAILED="FAILED";//日志失败状态
	public static String PENDING="PENDING";//日志失败状态
	
	public static String OPERATE_INSERT="INSERT";//保存数据
	public static String OPERATE_FECTH_FROM_WEB="FETCH FROM WEB";//从网页获取数据
	public static String OPERATE_CALL_ARCGIS_SERVICE="CALL ARCGIS SERVICE";//调用arcgis服务
	public static String OPERATE_PUBLISH_ARCGIS_SERVICE="PUBLISH ARCGIS SERVICE";//发布arcgis服务
	public static String OPERATE_QUERY="QUERY";//查询
	public static String OPERATE_EXPORT="EXPORT";//导出
	public static String OPERATE_COPY_FILE="COPY FILE";//拷贝文件
	public static String OPERATE_PARSE_FILE="PARSE FILE";//解析文件
	public static String OPERATE_UPLOAD_FILE="UPLOAD FILE";	//上传文件
	
	public static int COL_NUMBER=90;//区域列数
	public static int ROW_NUMBER=90;//区域行数
	
	public static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static SimpleDateFormat SDF_DB = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	public static SimpleDateFormat SDF_PARAM = new SimpleDateFormat("yyyyMMddHHmmss");
	
	public static Map<String,String> MODELS=new HashMap<String, String>();
	static{
		MODELS=ModelUtil.getModels();
	}
	public static Map<Integer,String> ROAMSITECODE=new HashMap<Integer, String>();
	public static List<Map<String,TreeMap<String,Map<String,Double>>>> COMPARERESULT=new ArrayList<Map<String,TreeMap<String,Map<String,Double>>>>();
	
	
}
