package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes5.dex */
public class g0n0 implements s7m<k0n0> {

    /* JADX INFO: renamed from: a */
    public ImageView f100064a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f100065b;

    /* JADX INFO: renamed from: c */
    public TextView f100066c;

    /* JADX INFO: renamed from: d */
    public TextView f100067d;

    /* JADX INFO: renamed from: e */
    public TextView f100068e;

    /* JADX INFO: renamed from: f */
    public k0n0 f100069f;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m123992d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l0n0.m148101b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(k0n0 k0n0Var) {
        this.f100069f = k0n0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m123994f(LiveMessage liveMessage, View view) {
        e51.m114766q(liveMessage.messageContent);
        this.f100069f.m144076N3();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m123995i(LiveMessage liveMessage, View view) {
        this.f100069f.m144082U3(new wu4(true, "@" + liveMessage.liveUserInfo.userName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m205591a(liveMessage.liveUserInfo.userId).m205592b("3"));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m123996j(LiveMessage liveMessage, View view) {
        this.f100069f.m144081T3(liveMessage);
    }

    /* JADX INFO: renamed from: k */
    public View m123997k(LayoutInflater layoutInflater, final LiveMessage liveMessage) {
        View viewM123992d = m123992d(layoutInflater, null);
        xdl0.m208329E0(this.f100066c, new View.OnClickListener() { // from class: l.d0n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83199a.m123994f(liveMessage, view);
            }
        });
        xdl0.m208329E0(this.f100067d, new View.OnClickListener() { // from class: l.e0n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88654a.m123995i(liveMessage, view);
            }
        });
        xdl0.m208329E0(this.f100068e, new View.OnClickListener() { // from class: l.f0n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93991a.m123996j(liveMessage, view);
            }
        });
        return viewM123992d;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
