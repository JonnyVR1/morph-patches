package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AiAlbumCheckEnvelope;
import com.p051p1.mobile.putong.core.data.AiAlbumRenderEnvelope;
import com.p051p1.mobile.putong.core.data.AiAlbumStatusEnvelope;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplatesEnvelope;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class qx6 extends dy6 {
    public qx6(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<AiAlbumTemplatesEnvelope> m178592m3(final int i, final String str) {
        return this.f91137Q.scheduled("get_ai_album_templates", 0, new pcj() { // from class: l.ex6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.nx6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-album/templates?mcc=" + i + "&gender=" + str)).m209032f().m209028b();
                    }
                }, AiAlbumTemplatesEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<AiAlbumCheckEnvelope> m178593n3(String str, String str2, List<String> list) {
        final JSONObject jSONObject = new JSONObject();
        final JSONArray jSONArray = new JSONArray();
        jyb.m147537z(list, new y20() { // from class: l.px6
            @Override // p153l.y20
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
        return this.f91137Q.scheduled("post_ai_album_check", -1, new pcj() { // from class: l.fx6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.gx6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-album/check")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }, AiAlbumCheckEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<AiAlbumRenderEnvelope> m178594o3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("albumId", str);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("post_ai_album_render", -1, new pcj() { // from class: l.jx6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.ox6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-album/render")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }, AiAlbumRenderEnvelope.JSON_ADAPTER);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<uxj0> m178595p3(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("albumId", str);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("post_ai_album_terminal", -1, new pcj() { // from class: l.hx6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.kx6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-album/terminal")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.lx6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<AiAlbumStatusEnvelope> m178596q3() {
        return this.f91137Q.scheduled("query_ai_album", 0, new pcj() { // from class: l.ix6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.mx6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/ai-album/query")).m209032f().m209028b();
                    }
                }, AiAlbumStatusEnvelope.JSON_ADAPTER);
            }
        });
    }
}
