package com.tencent.liteav.network;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.network.c */
/* JADX INFO: loaded from: classes2.dex */
class C14147c {

    /* JADX INFO: renamed from: c */
    private final String f59496c = "https://tcdns.myqcloud.com/queryip";

    /* JADX INFO: renamed from: d */
    private final String f59497d = "https://tcdnsipv6.myqcloud.com/queryip";

    /* JADX INFO: renamed from: e */
    private final String f59498e = "forward_stream";

    /* JADX INFO: renamed from: f */
    private final String f59499f = "forward_num";

    /* JADX INFO: renamed from: g */
    private final String f59500g = "request_type";

    /* JADX INFO: renamed from: h */
    private final String f59501h = Constants.JumpUrlConstants.URL_KEY_SDK_VERSION;

    /* JADX INFO: renamed from: i */
    private final String f59502i = "51451748-d8f2-4629-9071-db2983aa7251";

    /* JADX INFO: renamed from: j */
    private final int f59503j = 5;

    /* JADX INFO: renamed from: k */
    private final int f59504k = 2;

    /* JADX INFO: renamed from: a */
    public InterfaceC14146b f59494a = null;

    /* JADX INFO: renamed from: b */
    public int f59495b = 5;

    /* JADX INFO: renamed from: l */
    private Thread f59505l = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public ArrayList<C14136a> m83694a(String str) {
        JSONArray jSONArray;
        ArrayList<C14136a> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("state") != 0 || (jSONArray = jSONObject.getJSONObject("content").getJSONArray("list")) == null) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                C14136a c14136aM83690a = m83690a((JSONObject) jSONArray.opt(i));
                if (c14136aM83690a != null && c14136aM83690a.f59471c) {
                    arrayList.add(c14136aM83690a);
                }
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                C14136a c14136aM83690a2 = m83690a((JSONObject) jSONArray.opt(i2));
                if (c14136aM83690a2 != null && !c14136aM83690a2.f59471c) {
                    arrayList.add(c14136aM83690a2);
                }
            }
            if (C14025c.m82853a().m82878a("Network", "EnableRouteOptimize") == 1 && C14153i.m83735a().m83744c()) {
                ArrayList<C14136a> arrayListM83695a = m83695a(arrayList, true);
                m83696a(arrayListM83695a);
                return arrayListM83695a;
            }
            long jM82878a = C14025c.m82853a().m82878a("Network", "RouteSamplingMaxCount");
            if (jM82878a >= 1) {
                long jM83739a = C14153i.m83735a().m83739a("51451748-d8f2-4629-9071-db2983aa7251");
                if (jM83739a <= jM82878a) {
                    arrayList = m83695a(arrayList, false);
                    C14153i.m83735a().m83741a("51451748-d8f2-4629-9071-db2983aa7251", jM83739a + 1);
                }
            }
            m83696a(arrayList);
            return arrayList;
        } catch (JSONException e) {
            TXCLog.m82967e("TXCIntelligentRoute", "get records from json string failed.", e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    private InputStream m83697b(String str, int i, String str2) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("forward_stream", str);
            httpURLConnection.setRequestProperty("forward_num", "2");
            httpURLConnection.setRequestProperty(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, TXCCommonUtil.getSDKVersionStr());
            if (i == 1) {
                httpURLConnection.setRequestProperty("request_type", "1");
            } else if (i == 2) {
                httpURLConnection.setRequestProperty("request_type", "2");
            } else {
                httpURLConnection.setRequestProperty("request_type", "3");
            }
            int i2 = this.f59495b;
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2 * 1000);
                httpURLConnection.setReadTimeout(this.f59495b * 1000);
            }
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e) {
            TXCLog.m82967e("TXCIntelligentRoute", "http failed.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m83699c(String str) {
        if (!m83698b(str) && str != null) {
            for (String str2 : str.split("[.]")) {
                if (!m83700d(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private boolean m83700d(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX INFO: renamed from: b */
    private boolean m83698b(String str) {
        return str.split(":").length > 1;
    }

    /* JADX INFO: renamed from: a */
    public void m83701a(final String str, final int i) {
        Thread thread = new Thread("TXCPushRoute") { // from class: com.tencent.liteav.network.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (C14147c.this.f59494a == null) {
                    return;
                }
                ArrayList<C14136a> arrayList = new ArrayList<>();
                int i2 = 0;
                while (i2 < 7) {
                    try {
                        String strM83692a = C14147c.this.m83692a(str, i, i2 < 5 ? "https://tcdns.myqcloud.com/queryip" : "https://tcdnsipv6.myqcloud.com/queryip");
                        try {
                            JSONObject jSONObject = new JSONObject(strM83692a);
                            if (!jSONObject.has("use") || jSONObject.getInt("use") != 0) {
                                arrayList = C14147c.this.m83694a(strM83692a);
                                if (arrayList != null && arrayList.size() > 0) {
                                    break;
                                }
                                Thread.sleep(1000L, 0);
                                i2++;
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            TXCLog.m82967e("TXCIntelligentRoute", "get value from json failed.", e);
                        }
                    } catch (Exception e2) {
                        TXCLog.m82967e("TXCIntelligentRoute", "get json string failed.", e2);
                    }
                }
                C14147c.this.f59494a.onFetchDone(0, arrayList);
            }
        };
        this.f59505l = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m83692a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            InputStream inputStreamM83697b = m83697b(str, i, str2);
            if (inputStreamM83697b != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM83697b));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuffer.append(line);
                }
            } else {
                return "";
            }
        } catch (IOException e) {
            TXCLog.m82967e("TXCIntelligentRoute", "get json string from url failed.", e);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private C14136a m83690a(JSONObject jSONObject) {
        C14136a c14136a = new C14136a();
        try {
            c14136a.f59469a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            c14136a.f59470b = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            c14136a.f59473e = 0;
            c14136a.f59471c = false;
            c14136a.f59472d = m83699c(c14136a.f59469a);
            if (jSONObject.has("type") && jSONObject.getInt("type") == 2) {
                c14136a.f59471c = true;
            }
            return c14136a;
        } catch (JSONException e) {
            TXCLog.m82967e("TXCIntelligentRoute", "get ip record from json object failed.", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private ArrayList<C14136a> m83695a(ArrayList<C14136a> arrayList, boolean z) {
        C14136a c14136a;
        C14136a c14136a2;
        C14136a next = null;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C14136a> it = arrayList.iterator();
        loop0: while (true) {
            c14136a = next;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                next = it.next();
                if (next.f59471c) {
                    arrayList2.add(next);
                } else {
                    if (next.f59472d) {
                        break;
                    }
                    arrayList3.add(next);
                }
            }
        }
        ArrayList<C14136a> arrayList4 = new ArrayList<>();
        while (true) {
            if (arrayList2.size() <= 0 && arrayList3.size() <= 0) {
                break;
            }
            if (z) {
                if (c14136a != null) {
                    arrayList4.add(c14136a);
                }
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
            } else {
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
                if (c14136a != null) {
                    arrayList4.add(c14136a);
                }
            }
            if (arrayList3.size() > 0) {
                arrayList4.add(arrayList3.get(0));
                arrayList3.remove(0);
            }
        }
        int size = arrayList4.size();
        if (size > 0 && (c14136a2 = (C14136a) arrayList4.get(size - 1)) != null && !m83699c(c14136a2.f59469a) && c14136a != null) {
            arrayList4.add(c14136a);
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: a */
    private void m83696a(ArrayList<C14136a> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String str = "";
        for (C14136a c14136a : arrayList) {
            str = str + " \n Nearest IP: " + c14136a.f59469a + " Port: " + c14136a.f59470b + " Q Channel: " + c14136a.f59471c;
        }
        TXCLog.m82966e("TXCIntelligentRoute", str);
    }
}
