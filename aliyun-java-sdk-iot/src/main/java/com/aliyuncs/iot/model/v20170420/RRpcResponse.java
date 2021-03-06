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

package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20170420.RRpcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RRpcResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String rrpcCode;

	private String payloadBase64Byte;

	private Long messageId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRrpcCode() {
		return this.rrpcCode;
	}

	public void setRrpcCode(String rrpcCode) {
		this.rrpcCode = rrpcCode;
	}

	public String getPayloadBase64Byte() {
		return this.payloadBase64Byte;
	}

	public void setPayloadBase64Byte(String payloadBase64Byte) {
		this.payloadBase64Byte = payloadBase64Byte;
	}

	public Long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	@Override
	public RRpcResponse getInstance(UnmarshallerContext context) {
		return	RRpcResponseUnmarshaller.unmarshall(this, context);
	}
}
