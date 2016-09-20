package com.company;

/**
 * Created by Ratchanon on 9/19/2016.
 */
public class Calulate {

    float ot = 0;
    float wage = 0;



    public void calTimeRegular( float endTime , float stTime ,float totalTime ,String name){

        if (stTime <= 8.05 && endTime < 17.30) {

            if (stTime <= 8.00) {

                stTime = 8.00f;

                if (endTime < 12) {
                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime > 13) {
                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime >= 12.00 && endTime <= 13.00) {
                    endTime = 12.00f;
                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime >= 17.00 && endTime <= 17.30) {
                    endTime = 17.00f;
                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                }

            } else {  // 8.00 not more than  8.05

                if (endTime < 12) {

                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime > 13) {

                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                } else if (endTime >= 12.00 && endTime <= 13.00) {
                    endTime = 12.00f;
                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime >= 17.00 && endTime <= 17.30) {
                    endTime = 17.00f;
                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*36.25f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                }

            }

        } else {

            // irregular time

            if(stTime > 8.05 && endTime <= 24.00) {



                if ( stTime <= 12 && endTime >= 13.00 &&endTime < 17.30) {

                    totalTime = Math.abs((endTime - stTime)-1);
                    wage = totalTime*36.25f;
                    System.out.printf(name + "  %.2f Late = %.2f Bath\n",totalTime,wage );

                }
                else if (stTime <= 12 &&  endTime > 17.30) {

                    totalTime = Math.abs((endTime - stTime)-1);
                    ot = Math.abs((17.30f-endTime)*1.5f*36.25f);
                    wage = Math.abs(((17.30f-stTime)*36.25f)+ot);
                    System.out.printf(name + "  %.2f Late with OT = %.2f Bath\n",totalTime,wage );
                }

                else if (stTime <= 12 && endTime >=12.00 &&  endTime <= 13.00) {

                    endTime = 12.00f;
                    totalTime = Math.abs((endTime - stTime));
                    wage = totalTime*36.25f;
                    System.out.printf(name + "  %.2f Late = %.2f Bath\n",totalTime,wage );

                } else if (stTime > 12 && endTime >= 17.00 && endTime <= 17.30) {
                    stTime = 13.00f;
                    endTime = 17.00f;
                    totalTime = Math.abs((endTime - stTime));
                    wage = totalTime*36.25f;
                    System.out.printf(name + "  %.2f Late = %.2f Bath\n",totalTime,wage );

                }
                else if (stTime > 12 && endTime >= 17.30 && endTime <= 24.00) {
                    stTime = 13.00f;
                    totalTime = Math.abs((endTime - stTime)-0.30f);
                    ot = Math.abs((17.30f-endTime)*1.5f*36.25f);
                    wage = Math.abs(((17.30f-stTime)*36.25f)+ot);
                    System.out.printf(name + "  %.2f Late with OT = %.2f Bath\n",totalTime,wage );


                }
                else if (stTime >= 17.00 && endTime <= 24.00) {
                    //stTime = 17.30f;
                    totalTime = 24-stTime+endTime;
                    ot = Math.abs((17.30f-endTime)*1.5f*36.25f);
                    wage = Math.abs(((17.30f-stTime)*36.25f)+ot);
                    System.out.printf(name + "  %.2f OT = %.2f Bath\n",totalTime,wage );

                }


            }

            // check before 8.05

            else if (stTime <= 8.05 && stTime <= 24.00 ){

                if (stTime <= 8.00) {


                    stTime = 8.00f;

                    if ( endTime < 12.00) {

                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 12 && endTime <= 13.00) {

                        endTime = 12.00f;
                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if ( endTime >= 17.00 && endTime <= 17.30) {

                        endTime = 17.00f;
                        totalTime = Math.abs((endTime - stTime)-1);
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if (endTime >= 13.00 && endTime <= 17.00) {

                        totalTime = Math.abs((endTime - stTime)-1);
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 17.30 && endTime <= 24.00) {

                        totalTime = Math.abs((endTime - stTime) - Math.abs(17.30f - endTime));
                        ot = Math.abs((17.30f - endTime)*1.5f*36.25f);
                        wage = Math.abs(((17.30f-stTime)*36.25f)+ot);

                        System.out.printf(name + "  %.2f OT = %.2f Bath\n",totalTime,wage );

                    }
                }

                else    {

                    if ( endTime < 12.00) {

                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 12 && endTime <= 13.00) {

                        endTime = 12.00f;
                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if ( endTime >= 17.00 && endTime <= 17.30) {

                        endTime = 17.00f;
                        wage = totalTime*36.25f;
                        totalTime = Math.abs((endTime - stTime)-1);
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if (endTime >= 13.00 && endTime <= 17.00) {

                        totalTime = Math.abs((endTime - stTime)-1);
                        wage = totalTime*36.25f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 17.30 && endTime <= 24.00) {

                        totalTime = Math.abs((endTime - stTime));
                        ot = Math.abs((17.30f-endTime)*1.5f*36.25f);
                        wage = Math.abs(stTime-endTime)*1.5f*36.25f;
                        System.out.printf(name + "  %.2f OT = %.2f Bath\n",totalTime,wage );

                    }



                }

            } // end of before 8.05

        }




    }

    public void calTimeIrregular( float endTime , float stTime ,float totalTime ,String name){

        if (stTime <= 8.05 && endTime < 17.30) {

            if (stTime <= 8.00) {

                stTime = 8.00f;

                if (endTime < 12) {
                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime > 13) {
                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime >= 12.00 && endTime <= 13.00) {
                    endTime = 12.00f;
                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime >= 17.00 && endTime <= 17.30) {
                    endTime = 17.00f;
                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                }

            } else {  // 8.00 not more than  8.05

                if (endTime < 12) {

                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime > 13) {

                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                } else if (endTime >= 12.00 && endTime <= 13.00) {
                    endTime = 12.00f;
                    totalTime = Math.abs(endTime - stTime);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                } else if (endTime >= 17.00 && endTime <= 17.30) {
                    endTime = 17.00f;
                    totalTime = Math.abs((endTime - stTime) - 1);
                    wage = Math.abs(totalTime*54.375f);
                    System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );
                }

            }

        } else {

            // irregular time

            if(stTime > 8.05 && endTime <= 24.00) {



                if ( stTime <= 12 && endTime >= 13.00 &&endTime < 17.30) {

                    totalTime = Math.abs((endTime - stTime)-1);
                    wage = totalTime*54.375f;
                    System.out.printf(name + "  %.2f Late = %.2f Bath\n",totalTime,wage );

                }
                else if (stTime <= 12 &&  endTime > 17.30) {

                    totalTime = Math.abs((endTime - stTime)-1);
                    ot = Math.abs((17.30f-endTime)*2*54.375f);
                    wage = Math.abs(((17.30f-stTime)*54.375f)+ot);
                    System.out.printf(name + "  %.2f Late with OT = %.2f Bath\n",totalTime,wage );
                }

                else if (stTime <= 12 && endTime >=12.00 &&  endTime <= 13.00) {

                    endTime = 12.00f;
                    totalTime = Math.abs((endTime - stTime));
                    wage = totalTime*54.375f;
                    System.out.printf(name + "  %.2f Late = %.2f Bath\n",totalTime,wage );

                } else if (stTime > 12 && endTime >= 17.00 && endTime <= 17.30) {
                    stTime = 13.00f;
                    endTime = 17.00f;
                    totalTime = Math.abs((endTime - stTime));
                    wage = totalTime*54.375f;
                    System.out.printf(name + "  %.2f Late = %.2f Bath\n",totalTime,wage );

                }
                else if (stTime > 12 && endTime >= 17.30 && endTime <= 24.00) {
                    stTime = 13.00f;
                    totalTime = Math.abs((endTime - stTime)-0.30f);
                    ot = Math.abs((17.30f-endTime)*2*54.375f);
                    wage = Math.abs(((17.30f-stTime)*36.25f)+ot);
                    System.out.printf(name + "  %.2f Late with OT = %.2f Bath\n",totalTime,wage );


                }
                else if (stTime >= 17.00 && endTime <= 24.00) {
                    //stTime = 17.30f;
                    totalTime = 24-stTime+endTime;
                    ot = Math.abs((17.30f-endTime)*2*54.375f);
                    wage = Math.abs(((17.30f-stTime)*54.375f)+ot);
                    System.out.printf(name + "  %.2f OT = %.2f Bath\n",totalTime,wage );

                }


            }

            // check before 8.05

            else if (stTime <= 8.05 && stTime <= 24.00 ){

                if (stTime <= 8.00) {


                    stTime = 8.00f;

                    if ( endTime < 12.00) {

                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*54.375f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 12 && endTime <= 13.00) {

                        endTime = 12.00f;
                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*54.375f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if ( endTime >= 17.00 && endTime <= 17.30) {

                        endTime = 17.00f;
                        totalTime = Math.abs((endTime - stTime)-1);
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if (endTime >= 13.00 && endTime <= 17.00) {

                        totalTime = Math.abs((endTime - stTime)-1);
                        wage = totalTime*54.375f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 17.30 && endTime <= 24.00) {

                        totalTime = Math.abs((endTime - stTime) - Math.abs(17.30f - endTime));
                        ot = Math.abs((17.30f - endTime)*2*54.375f);
                        wage = Math.abs(((17.30f-stTime)*54.375f)+ot);

                        System.out.printf(name + "  %.2f OT = %.2f Bath\n",totalTime,wage );

                    }
                }

                else    {

                    if ( endTime < 12.00) {

                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*54.375f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 12 && endTime <= 13.00) {

                        endTime = 12.00f;
                        totalTime = Math.abs((endTime - stTime));
                        wage = totalTime*54.375f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if ( endTime >= 17.00 && endTime <= 17.30) {

                        endTime = 17.00f;
                        wage = totalTime*54.375f;
                        totalTime = Math.abs((endTime - stTime)-1);
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );

                    } else if (endTime >= 13.00 && endTime <= 17.00) {

                        totalTime = Math.abs((endTime - stTime)-1);
                        wage = totalTime*54.375f;
                        System.out.printf(name + "  %.2f = %.2f Bath\n",totalTime,wage );


                    } else if (endTime >= 17.30 && endTime <= 24.00) {

                        totalTime = Math.abs((endTime - stTime));
                        ot = Math.abs((17.30f-endTime)*2*54.375f);
                        wage = Math.abs(stTime-endTime)*2*54.375f;
                        System.out.printf(name + "  %.2f OT = %.2f Bath\n",totalTime,wage );

                    }



                }

            } // end of before 8.05

        }



    }

}
