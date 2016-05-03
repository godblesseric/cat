package com.zs.cat.cms.task;

import org.quartz.JobExecutionContext;
/**import org.quartz.StatefulJob;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;

 import com.zs.cat.schedule.frame.AbstractTask;


 public class PEfilePushTask extends AbstractTask implements StatefulJob{

 private static final Logger logger = LoggerFactory.getLogger(PEfilePushTask.class);


 @Override public String doTask(JobExecutionContext context)throws Exception {
 String result = "任务执行成功!";
 logger.info("【推送模块】PEstart...");
 logger.debug("【推送模块】PEstart...");

 System.out.println("start.............");
 logger.info("【推送模块】PEend....");
 logger.debug("【推送模块】PEend....");
 return result;


 }

 }
 **/