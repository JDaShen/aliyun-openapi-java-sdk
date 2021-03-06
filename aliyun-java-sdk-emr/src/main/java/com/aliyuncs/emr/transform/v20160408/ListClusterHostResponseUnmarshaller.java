/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterHostResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostResponse.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostResponseUnmarshaller {

	public static ListClusterHostResponse unmarshall(ListClusterHostResponse listClusterHostResponse, UnmarshallerContext context) {
		
		listClusterHostResponse.setRequestId(context.stringValue("ListClusterHostResponse.RequestId"));
		listClusterHostResponse.setPageNumber(context.integerValue("ListClusterHostResponse.PageNumber"));
		listClusterHostResponse.setPageSize(context.integerValue("ListClusterHostResponse.PageSize"));
		listClusterHostResponse.setTotal(context.integerValue("ListClusterHostResponse.Total"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("ListClusterHostResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(context.stringValue("ListClusterHostResponse.HostList["+ i +"].HostId"));
			host.setHostName(context.stringValue("ListClusterHostResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(context.stringValue("ListClusterHostResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(context.stringValue("ListClusterHostResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(context.stringValue("ListClusterHostResponse.HostList["+ i +"].Role"));
			host.setInstanceType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(context.integerValue("ListClusterHostResponse.HostList["+ i +"].Cpu"));
			host.setMemory(context.integerValue("ListClusterHostResponse.HostList["+ i +"].Memory"));
			host.setStatus(context.stringValue("ListClusterHostResponse.HostList["+ i +"].Status"));
			host.setType(context.stringValue("ListClusterHostResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(context.stringValue("ListClusterHostResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(context.stringValue("ListClusterHostResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listClusterHostResponse.setHostList(hostList);
	 
	 	return listClusterHostResponse;
	}
}