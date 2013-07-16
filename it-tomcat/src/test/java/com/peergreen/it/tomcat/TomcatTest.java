/**
 * Copyright 2013 Peergreen S.A.S. All rights reserved.
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.peergreen.it.tomcat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.peergreen.tests.legacy.felix.webconsole.FelixWebConsoleTest;
import com.peergreen.tests.legacy.jenkins.JenkinsTest;


@RunWith(Suite.class)
@SuiteClasses({FelixWebConsoleTest.class, JenkinsTest.class})
public class TomcatTest {

}