# GitHubUserAPI
API endpoints that expands functionality of the GitHub API

**Before getting started**, you need to first make sure that you have the latest JDK installed on your computer.
For details, refer to:  https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

**Next**, you need to make sure that you have the latest version of Maven.
For details, refer to:  https://maven.apache.org/install.html

**Now**, either in the Command Prompt in Windows or the Terminal, execute the following line in the same directory as your pom.xml:  
mvn exec:java

**It should result in looking something like this:**  
 .
 .
 .
2019-06-25 21:18:30.065  INFO 4682 --- [lication.main()] com.erik.GitHubApplication               : Started GitHubApplication in 2.16 seconds (JVM running for 3.381) 
2019-06-25 21:18:40.411  INFO 4682 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-06-25 21:18:40.411  INFO 4682 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
 2019-06-25 21:18:40.419  INFO 4682 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 8 ms
 
 
**Now**, from any broswer (I recommend Firefox), copy the following into the url textbox:  
localhost:8080/followers?id=1

**You should see something like this:**
[
    {
        "id": 1,
        "followerList": [
            {
                "id": 108762,
                "followerList": [
                    {
                        "id": 1236032,
                        "followerList": [
                            {
                                "id": 108762,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 28534,
                        "followerList": [
                            {
                                "id": 1727262,
                                "followerList": null
                            },
                            {
                                "id": 1742,
                                "followerList": null
                            },
                            {
                                "id": 10965,
                                "followerList": null
                            },
                            {
                                "id": 56147,
                                "followerList": null
                            },
                            {
                                "id": 68521,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1858476,
                        "followerList": [
                            {
                                "id": 108762,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1130921,
                        "followerList": [
                            {
                                "id": 1858476,
                                "followerList": null
                            },
                            {
                                "id": 108762,
                                "followerList": null
                            },
                            {
                                "id": 754011,
                                "followerList": null
                            },
                            {
                                "id": 634379,
                                "followerList": null
                            },
                            {
                                "id": 1407926,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 2098825,
                        "followerList": []
                    }
                ]
            },
            {
                "id": 117560,
                "followerList": [
                    {
                        "id": 373356,
                        "followerList": [
                            {
                                "id": 117560,
                                "followerList": null
                            },
                            {
                                "id": 118850,
                                "followerList": null
                            },
                            {
                                "id": 887710,
                                "followerList": null
                            },
                            {
                                "id": 1574389,
                                "followerList": null
                            },
                            {
                                "id": 56947,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 983426,
                        "followerList": [
                            {
                                "id": 1483184,
                                "followerList": null
                            },
                            {
                                "id": 3440453,
                                "followerList": null
                            },
                            {
                                "id": 4265703,
                                "followerList": null
                            },
                            {
                                "id": 3423544,
                                "followerList": null
                            },
                            {
                                "id": 4107768,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 385688,
                        "followerList": [
                            {
                                "id": 110165,
                                "followerList": null
                            },
                            {
                                "id": 255980,
                                "followerList": null
                            },
                            {
                                "id": 641997,
                                "followerList": null
                            },
                            {
                                "id": 1451865,
                                "followerList": null
                            },
                            {
                                "id": 1831367,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1177000,
                        "followerList": [
                            {
                                "id": 1194891,
                                "followerList": null
                            },
                            {
                                "id": 1761178,
                                "followerList": null
                            },
                            {
                                "id": 1776260,
                                "followerList": null
                            },
                            {
                                "id": 2281056,
                                "followerList": null
                            },
                            {
                                "id": 2554653,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1817452,
                        "followerList": [
                            {
                                "id": 1298554,
                                "followerList": null
                            },
                            {
                                "id": 570848,
                                "followerList": null
                            }
                        ]
                    }
                ]
            },
            {
                "id": 121695,
                "followerList": [
                    {
                        "id": 860644,
                        "followerList": [
                            {
                                "id": 35883,
                                "followerList": null
                            },
                            {
                                "id": 58519,
                                "followerList": null
                            },
                            {
                                "id": 65407,
                                "followerList": null
                            },
                            {
                                "id": 118789,
                                "followerList": null
                            },
                            {
                                "id": 121695,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1551495,
                        "followerList": [
                            {
                                "id": 1552795,
                                "followerList": null
                            },
                            {
                                "id": 121695,
                                "followerList": null
                            },
                            {
                                "id": 10126728,
                                "followerList": null
                            },
                            {
                                "id": 11908570,
                                "followerList": null
                            },
                            {
                                "id": 16712940,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1831367,
                        "followerList": [
                            {
                                "id": 1871223,
                                "followerList": null
                            },
                            {
                                "id": 31597,
                                "followerList": null
                            },
                            {
                                "id": 121051,
                                "followerList": null
                            },
                            {
                                "id": 172931,
                                "followerList": null
                            },
                            {
                                "id": 313050,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 1933408,
                        "followerList": [
                            {
                                "id": 1831367,
                                "followerList": null
                            },
                            {
                                "id": 121695,
                                "followerList": null
                            },
                            {
                                "id": 1845707,
                                "followerList": null
                            },
                            {
                                "id": 2398264,
                                "followerList": null
                            },
                            {
                                "id": 4409496,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 192708,
                        "followerList": [
                            {
                                "id": 121695,
                                "followerList": null
                            },
                            {
                                "id": 302414,
                                "followerList": null
                            },
                            {
                                "id": 558752,
                                "followerList": null
                            },
                            {
                                "id": 1614009,
                                "followerList": null
                            },
                            {
                                "id": 3116394,
                                "followerList": null
                            }
                        ]
                    }
                ]
            },
            {
                "id": 404716,
                "followerList": [
                    {
                        "id": 28248,
                        "followerList": [
                            {
                                "id": 990,
                                "followerList": null
                            },
                            {
                                "id": 1873,
                                "followerList": null
                            },
                            {
                                "id": 4250,
                                "followerList": null
                            },
                            {
                                "id": 4425,
                                "followerList": null
                            },
                            {
                                "id": 5569,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 37922,
                        "followerList": [
                            {
                                "id": 485,
                                "followerList": null
                            },
                            {
                                "id": 3499,
                                "followerList": null
                            },
                            {
                                "id": 4289,
                                "followerList": null
                            },
                            {
                                "id": 4970,
                                "followerList": null
                            },
                            {
                                "id": 6956,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 46673,
                        "followerList": [
                            {
                                "id": 80,
                                "followerList": null
                            },
                            {
                                "id": 168,
                                "followerList": null
                            },
                            {
                                "id": 747,
                                "followerList": null
                            },
                            {
                                "id": 851,
                                "followerList": null
                            },
                            {
                                "id": 990,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 86942,
                        "followerList": [
                            {
                                "id": 12523,
                                "followerList": null
                            },
                            {
                                "id": 70011,
                                "followerList": null
                            },
                            {
                                "id": 116530,
                                "followerList": null
                            },
                            {
                                "id": 131281,
                                "followerList": null
                            },
                            {
                                "id": 462773,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 98879,
                        "followerList": [
                            {
                                "id": 28445,
                                "followerList": null
                            },
                            {
                                "id": 98841,
                                "followerList": null
                            },
                            {
                                "id": 253822,
                                "followerList": null
                            },
                            {
                                "id": 404716,
                                "followerList": null
                            },
                            {
                                "id": 662780,
                                "followerList": null
                            }
                        ]
                    }
                ]
            },
            {
                "id": 738268,
                "followerList": [
                    {
                        "id": 4409496,
                        "followerList": [
                            {
                                "id": 4069826,
                                "followerList": null
                            },
                            {
                                "id": 5345355,
                                "followerList": null
                            },
                            {
                                "id": 3693121,
                                "followerList": null
                            },
                            {
                                "id": 954309,
                                "followerList": null
                            },
                            {
                                "id": 340581,
                                "followerList": null
                            }
                        ]
                    },
                    {
                        "id": 11003370,
                        "followerList": [
                            {
                                "id": 7304741,
                                "followerList": null
                            }
                        ]
                    }
                ]
            }
        ]
    }
]
