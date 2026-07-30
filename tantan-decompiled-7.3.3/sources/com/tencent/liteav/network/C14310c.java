package com.tencent.liteav.network;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p094d.C14188c;
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
class C14310c {

    /* JADX INFO: renamed from: c */
    private final String f60344c = "https://tcdns.myqcloud.com/queryip";

    /* JADX INFO: renamed from: d */
    private final String f60345d = "https://tcdnsipv6.myqcloud.com/queryip";

    /* JADX INFO: renamed from: e */
    private final String f60346e = "forward_stream";

    /* JADX INFO: renamed from: f */
    private final String f60347f = "forward_num";

    /* JADX INFO: renamed from: g */
    private final String f60348g = "request_type";

    /* JADX INFO: renamed from: h */
    private final String f60349h = Constants.JumpUrlConstants.URL_KEY_SDK_VERSION;

    /* JADX INFO: renamed from: i */
    private final String f60350i = "51451748-d8f2-4629-9071-db2983aa7251";

    /* JADX INFO: renamed from: j */
    private final int f60351j = 5;

    /* JADX INFO: renamed from: k */
    private final int f60352k = 2;

    /* JADX INFO: renamed from: a */
    public InterfaceC14309b f60342a = null;

    /* JADX INFO: renamed from: b */
    public int f60343b = 5;

    /* JADX INFO: renamed from: l */
    private Thread f60353l = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public ArrayList<C14299a> m84877a(String str) {
        JSONArray jSONArray;
        ArrayList<C14299a> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("state") != 0 || (jSONArray = jSONObject.getJSONObject("content").getJSONArray("list")) == null) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                C14299a c14299aM84873a = m84873a((JSONObject) jSONArray.opt(i));
                if (c14299aM84873a != null && c14299aM84873a.f60319c) {
                    arrayList.add(c14299aM84873a);
                }
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                C14299a c14299aM84873a2 = m84873a((JSONObject) jSONArray.opt(i2));
                if (c14299aM84873a2 != null && !c14299aM84873a2.f60319c) {
                    arrayList.add(c14299aM84873a2);
                }
            }
            if (C14188c.m84036a().m84061a("Network", "EnableRouteOptimize") == 1 && C14316i.m84918a().m84927c()) {
                ArrayList<C14299a> arrayListM84878a = m84878a(arrayList, true);
                m84879a(arrayListM84878a);
                return arrayListM84878a;
            }
            long jM84061a = C14188c.m84036a().m84061a("Network", "RouteSamplingMaxCount");
            if (jM84061a >= 1) {
                long jM84922a = C14316i.m84918a().m84922a("51451748-d8f2-4629-9071-db2983aa7251");
                if (jM84922a <= jM84061a) {
                    arrayList = m84878a(arrayList, false);
                    C14316i.m84918a().m84924a("51451748-d8f2-4629-9071-db2983aa7251", jM84922a + 1);
                }
            }
            m84879a(arrayList);
            return arrayList;
        } catch (JSONException e) {
            TXCLog.m84150e("TXCIntelligentRoute", "get records from json string failed.", e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: b */
    private InputStream m84880b(String str, int i, String str2) throws IOException {
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
            int i2 = this.f60343b;
            if (i2 > 0) {
                httpURLConnection.setConnectTimeout(i2 * 1000);
                httpURLConnection.setReadTimeout(this.f60343b * 1000);
            }
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e) {
            TXCLog.m84150e("TXCIntelligentRoute", "http failed.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m84882c(String str) {
        if (!m84881b(str) && str != null) {
            for (String str2 : str.split("[.]")) {
                if (!m84883d(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private boolean m84883d(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX INFO: renamed from: b */
    private boolean m84881b(String str) {
        return str.split(":").length > 1;
    }

    /* JADX INFO: renamed from: a */
    public void m84884a(final String str, final int i) {
        Thread thread = new Thread("TXCPushRoute") { // from class: com.tencent.liteav.network.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (C14310c.this.f60342a == null) {
                    return;
                }
                ArrayList<C14299a> arrayList = new ArrayList<>();
                int i2 = 0;
                while (i2 < 7) {
                    try {
                        String strM84875a = C14310c.this.m84875a(str, i, i2 < 5 ? "https://tcdns.myqcloud.com/queryip" : "https://tcdnsipv6.myqcloud.com/queryip");
                        try {
                            JSONObject jSONObject = new JSONObject(strM84875a);
                            if (!jSONObject.has("use") || jSONObject.getInt("use") != 0) {
                                arrayList = C14310c.this.m84877a(strM84875a);
                                if (arrayList != null && arrayList.size() > 0) {
                                    break;
                                }
                                Thread.sleep(1000L, 0);
                                i2++;
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            TXCLog.m84150e("TXCIntelligentRoute", "get value from json failed.", e);
                        }
                    } catch (Exception e2) {
                        TXCLog.m84150e("TXCIntelligentRoute", "get json string failed.", e2);
                    }
                }
                C14310c.this.f60342a.onFetchDone(0, arrayList);
            }
        };
        this.f60353l = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m84875a(String str, int i, String str2) {
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            InputStream inputStreamM84880b = m84880b(str, i, str2);
            if (inputStreamM84880b != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM84880b));
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
            TXCLog.m84150e("TXCIntelligentRoute", "get json string from url failed.", e);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private C14299a m84873a(JSONObject jSONObject) {
        C14299a c14299a = new C14299a();
        try {
            c14299a.f60317a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            c14299a.f60318b = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            c14299a.f60321e = 0;
            c14299a.f60319c = false;
            c14299a.f60320d = m84882c(c14299a.f60317a);
            if (jSONObject.has("type") && jSONObject.getInt("type") == 2) {
                c14299a.f60319c = true;
            }
            return c14299a;
        } catch (JSONException e) {
            TXCLog.m84150e("TXCIntelligentRoute", "get ip record from json object failed.", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private ArrayList<C14299a> m84878a(ArrayList<C14299a> arrayList, boolean z) {
        C14299a c14299a;
        C14299a c14299a2;
        C14299a next = null;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C14299a> it = arrayList.iterator();
        loop0: while (true) {
            c14299a = next;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                next = it.next();
                if (next.f60319c) {
                    arrayList2.add(next);
                } else {
                    if (next.f60320d) {
                        break;
                    }
                    arrayList3.add(next);
                }
            }
        }
        ArrayList<C14299a> arrayList4 = new ArrayList<>();
        while (true) {
            if (arrayList2.size() <= 0 && arrayList3.size() <= 0) {
                break;
            }
            if (z) {
                if (c14299a != null) {
                    arrayList4.add(c14299a);
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
                if (c14299a != null) {
                    arrayList4.add(c14299a);
                }
            }
            if (arrayList3.size() > 0) {
                arrayList4.add(arrayList3.get(0));
                arrayList3.remove(0);
            }
        }
        int size = arrayList4.size();
        if (size > 0 && (c14299a2 = (C14299a) arrayList4.get(size - 1)) != null && !m84882c(c14299a2.f60317a) && c14299a != null) {
            arrayList4.add(c14299a);
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: a */
    private void m84879a(ArrayList<C14299a> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String str = "";
        for (C14299a c14299a : arrayList) {
            str = str + " \n Nearest IP: " + c14299a.f60317a + " Port: " + c14299a.f60318b + " Q Channel: " + c14299a.f60319c;
        }
        TXCLog.m84149e("TXCIntelligentRoute", str);
    }
}
