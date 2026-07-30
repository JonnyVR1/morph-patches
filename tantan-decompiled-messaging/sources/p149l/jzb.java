package p149l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jzb extends WebSocketClient {

    /* JADX INFO: renamed from: a */
    private String f120368a;

    /* JADX INFO: renamed from: b */
    private int f120369b;

    public jzb(URI uri, Draft draft, String str, int i) {
        super(uri, draft);
        this.f120368a = str;
        this.f120369b = i;
    }

    /* JADX INFO: renamed from: b */
    private void m143890b(JSONObject jSONObject) {
        shw.m184285e();
    }

    /* JADX INFO: renamed from: a */
    public int m143891a() {
        return this.f120369b;
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onClose(int i, String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_didclose");
            jSONObject.put(Reason.TYPE, "socket not connected!");
            jSONObject.put("code", "");
            m143890b(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onError(Exception exc) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_didfail");
            jSONObject.put("erroinfo", "socket not connected!");
            m143890b(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_recMsg");
            jSONObject.put("msg", he2.m130617b(str.getBytes()));
            m143890b(jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onOpen(ServerHandshake serverHandshake) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_didopen");
            m143890b(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // org.java_websocket.client.WebSocketClient, org.java_websocket.WebSocket
    public void send(String str) {
        try {
            try {
                super.send(str);
            } catch (JSONException unused) {
            }
        } catch (NotYetConnectedException unused2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_sendFail");
            jSONObject.put("erroinfo", "socket not connected!");
            m143890b(jSONObject);
        }
    }

    @Override // org.java_websocket.client.WebSocketClient, org.java_websocket.WebSocket
    public void send(byte[] bArr) {
        try {
            try {
                super.send(bArr);
            } catch (JSONException unused) {
            }
        } catch (NotYetConnectedException unused2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_sendFail");
            jSONObject.put("erroinfo", "socket not connected!");
            m143890b(jSONObject);
        }
    }

    @Override // org.java_websocket.client.WebSocketClient
    public void onMessage(ByteBuffer byteBuffer) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_KEY, this.f120368a);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "websocket_recMsg");
            jSONObject.put("msg", he2.m130617b(byteBuffer.array()));
            m143890b(jSONObject);
        } catch (Exception unused) {
        }
    }
}
