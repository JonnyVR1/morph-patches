package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.AiAlbumCheckEnvelope;
import com.p1.mobile.putong.core.data.AiAlbumRenderEnvelope;
import com.p1.mobile.putong.core.data.AiAlbumStatusEnvelope;
import com.p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import java.util.List;
import l.e30;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nw6 extends ax6 {
    public nw6(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: m3 */
    public c<AiAlbumTemplatesEnvelope> m20241m3(final int i, final String str) {
        return this.f8580Q.scheduled("get_ai_album_templates", 0, new v9j() { // from class: l.bw6
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.kw6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-album/templates?mcc=" + i + "&gender=" + str)).f().b();
                    }
                }, AiAlbumTemplatesEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public c<AiAlbumCheckEnvelope> m20242n3(String str, String str2, List<String> list) {
        final JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        vwb.z(list, new e30() { // from class: l.mw6
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
        return this.f8580Q.scheduled("post_ai_album_check", -1, new v9j() { // from class: l.cw6
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.dw6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-album/check")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }, AiAlbumCheckEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public c<AiAlbumRenderEnvelope> m20243o3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("albumId", str);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("post_ai_album_render", -1, new v9j() { // from class: l.gw6
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.lw6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-album/render")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }, AiAlbumRenderEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public c<roj0> m20244p3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("albumId", str);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("post_ai_album_terminal", -1, new v9j() { // from class: l.ew6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.hw6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-album/terminal")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.iw6
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public c<AiAlbumStatusEnvelope> m20245q3() {
        return this.f8580Q.scheduled("query_ai_album", 0, new v9j() { // from class: l.fw6
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.jw6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/ai-album/query")).f().b();
                    }
                }, AiAlbumStatusEnvelope.JSON_ADAPTER);
            }
        });
    }
}
