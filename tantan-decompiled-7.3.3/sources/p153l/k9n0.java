package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes5.dex */
public class k9n0 implements iam<o9n0> {

    /* JADX INFO: renamed from: a */
    public ImageView f124561a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f124562b;

    /* JADX INFO: renamed from: c */
    public TextView f124563c;

    /* JADX INFO: renamed from: d */
    public TextView f124564d;

    /* JADX INFO: renamed from: e */
    public TextView f124565e;

    /* JADX INFO: renamed from: f */
    public o9n0 f124566f;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m148877d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p9n0.m171369b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o9n0 o9n0Var) {
        this.f124566f = o9n0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m148879f(LiveMessage liveMessage, View view) {
        l51.m152911q(liveMessage.messageContent);
        this.f124566f.m166764N3();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m148880i(LiveMessage liveMessage, View view) {
        this.f124566f.m166770U3(new vv4(true, "@" + liveMessage.liveUserInfo.userName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m202991a(liveMessage.liveUserInfo.userId).m202992b("3"));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m148881j(LiveMessage liveMessage, View view) {
        this.f124566f.m166769T3(liveMessage);
    }

    /* JADX INFO: renamed from: k */
    public View m148882k(LayoutInflater layoutInflater, final LiveMessage liveMessage) {
        View viewM148877d = m148877d(layoutInflater, null);
        bnl0.m105509E0(this.f124563c, new View.OnClickListener() { // from class: l.h9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108418a.m148879f(liveMessage, view);
            }
        });
        bnl0.m105509E0(this.f124564d, new View.OnClickListener() { // from class: l.i9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113492a.m148880i(liveMessage, view);
            }
        });
        bnl0.m105509E0(this.f124565e, new View.OnClickListener() { // from class: l.j9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118891a.m148881j(liveMessage, view);
            }
        });
        return viewM148877d;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
