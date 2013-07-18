/**
 * Copyright 2013 Peergreen S.A.S. All rights reserved.
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.peergreen.it.was;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.peergreen.tests.jaxrs.javaee.jaxrs20.suite.JAXRS20TestSuite;
import com.peergreen.tests.jpa.javaee.jpa20.suite.JPA20TestSuite;
import com.peergreen.tests.legacy.felix.webconsole.FelixWebConsoleTest;
import com.peergreen.tests.legacy.jenkins.JenkinsTest;
import com.peergreen.tests.legacy.nexus.NexusTest;


@RunWith(Suite.class)
@SuiteClasses({/* fix injection JTA11TestSuite.class, */JPA20TestSuite.class, JAXRS20TestSuite.class, JenkinsTest.class, NexusTest.class, FelixWebConsoleTest.class})
public class WASTest {

}
