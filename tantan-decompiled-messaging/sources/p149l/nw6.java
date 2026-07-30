package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AiAlbumCheckEnvelope;
import com.p046p1.mobile.putong.core.data.AiAlbumRenderEnvelope;
import com.p046p1.mobile.putong.core.data.AiAlbumStatusEnvelope;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class nw6 extends ax6 {
    public nw6(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<AiAlbumTemplatesEnvelope> m161802m3(final int i, final String str) {
        return this.f72126Q.scheduled("get_ai_album_templates", 0, new v9j() { // from class: l.bw6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.kw6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-album/templates?mcc=" + i + "&gender=" + str)).m185887f().m185883b();
                    }
                }, AiAlbumTemplatesEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<AiAlbumCheckEnvelope> m161803n3(String str, String str2, List<String> list) {
        final JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        vwb.m200354z(list, new e30() { // from class: l.mw6
            @Override // p149l.e30
            public final void call(Object obj) {
                jSONArray.put((String) obj);
            }
        });
        try {
            jSONObject.put("albumId", str);
            jSONObject.put("templateId", str2);
            jSONObject.put("images", jSONArray);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("post_ai_album_check", -1, new v9j() { // from class: l.cw6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.dw6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-album/check")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }, AiAlbumCheckEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<AiAlbumRenderEnvelope> m161804o3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("albumId", str);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("post_ai_album_render", -1, new v9j() { // from class: l.gw6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.lw6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-album/render")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }, AiAlbumRenderEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<roj0> m161805p3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("albumId", str);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("post_ai_album_terminal", -1, new v9j() { // from class: l.ew6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.hw6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-album/terminal")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.iw6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<AiAlbumStatusEnvelope> m161806q3() {
        return this.f72126Q.scheduled("query_ai_album", 0, new v9j() { // from class: l.fw6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.jw6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/ai-album/query")).m185887f().m185883b();
                    }
                }, AiAlbumStatusEnvelope.JSON_ADAPTER);
            }
        });
    }
}
