/**     
  * 文件描述
  * @ProductName:    Hundsun HEP
  * @ProjectName:    arcs-biz-app
  * @Package:        com.hundsun.arcs.biz.executor
  * @FileName:		 TimeExecutors.java
  * @TypeName:		 TimeExecutors
  * @Description:    note
  * @Author:         fangxc31860
  * @CreateDate:     2021-3-4 17:21:52
  * @UpdateUser:     fangxc31860
  * @UpdateDate:     2021-3-4 17:21:52
  * @UpdateRemark:   The modified content
  * @Version:        1.0
  *
  * Copyright © 2021 Hundsun Technologies Inc. All Rights Reserved
**/
package com.fang.controller.Thread;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fangxc31860
 *
 */
public class TimeExecutors implements Runnable{
	Timer timer = new Timer();
	public void run() {
		//定时任务，指定时间进行
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("====================================");
			}
		}, 5*1000);
	}
	public void cancel(){
		timer.cancel();
		System.out.println("!!!!!!!!!!!!!!!!!");
	}
//	public void run() {
//		time = System.currentTimeMillis()/1000;
//	}
//	public void stop() {
//		time = System.currentTimeMillis()/1000 - time;
//		System.out.println("执行了时间" + time);
//		if(time > 5) {
//			System.out.println("超时了！！！！！");
//		}
//	}
}
