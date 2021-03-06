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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeAccountsResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeAccountsResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setInstanceId(context.stringValue("DescribeAccountsResponse.InstanceId"));

		List<Account> accountList = new ArrayList<Account>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.AccountList.Length"); i++) {
			Account account = new Account();
			account.setAccountName(context.stringValue("DescribeAccountsResponse.AccountList["+ i +"].AccountName"));
			account.setAccountStatus(context.stringValue("DescribeAccountsResponse.AccountList["+ i +"].AccountStatus"));

			accountList.add(account);
		}
		describeAccountsResponse.setAccountList(accountList);
	 
	 	return describeAccountsResponse;
	}
}