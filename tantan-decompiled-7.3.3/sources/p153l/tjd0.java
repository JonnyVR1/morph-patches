package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherPreviewView;

/* JADX INFO: loaded from: classes5.dex */
public class tjd0 implements iam<wkd0> {

    /* JADX INFO: renamed from: a */
    public c0s f174574a;

    /* JADX INFO: renamed from: b */
    public wkd0 f174575b;

    /* JADX INFO: renamed from: c */
    public RoomPusherPreviewView f174576c;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f174575b.act();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f174575b.act();
    }

    /* JADX INFO: renamed from: e */
    public void m191414e() {
        bnl0.m105524M(this.f174576c.f52366c, false);
        bnl0.m105524M(this.f174576c.f52365b, true);
        bnl0.m105524M(this.f174576c.f52364a, true);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wkd0 wkd0Var) {
        this.f174575b = wkd0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m191416i(final String str) {
        this.f174576c = m191417j();
        BeautyMenuView beautyMenuView = (BeautyMenuView) getAct().inflater().inflate(yec0.f199211q, (ViewGroup) null);
        this.f174575b.f189537i.m164836Y3(beautyMenuView.f52298e, null);
        this.f174574a = new c0s(this.f174575b, beautyMenuView);
        bnl0.m105524M(beautyMenuView.f52297d, true);
        bnl0.m105524M(beautyMenuView.f52299f, true);
        beautyMenuView.f52297d.setOnClickListener(new View.OnClickListener() { // from class: l.pjd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152685a.m191420m(str, view);
            }
        });
        beautyMenuView.f52299f.setOnClickListener(new View.OnClickListener() { // from class: l.qjd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157961a.m191421n(str, view);
            }
        });
        bnl0.m105524M(beautyMenuView.f52299f, true);
        int iM175859d = qa00.m175859d(166.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM175859d, iM175859d);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = qa00.m175859d(10.0f);
        beautyMenuView.f52300g.addView(this.f174576c, layoutParams);
        this.f174574a.m72955d0(false);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final RoomPusherPreviewView m191417j() {
        RoomPusherPreviewView roomPusherPreviewView = (RoomPusherPreviewView) getAct().inflater().inflate(yec0.f199113i5, (ViewGroup) null);
        bnl0.m105524M(roomPusherPreviewView, true);
        bnl0.m105524M(roomPusherPreviewView.f52365b, false);
        bnl0.m105524M(roomPusherPreviewView.f52364a, false);
        roomPusherPreviewView.f52365b.setOnClickListener(new View.OnClickListener() { // from class: l.rjd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163448a.m191422p(view);
            }
        });
        roomPusherPreviewView.setBackgroundResource(obc0.f146057H7);
        roomPusherPreviewView.f52366c.setOnClickListener(new View.OnClickListener() { // from class: l.sjd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168959a.m191423q(view);
            }
        });
        return roomPusherPreviewView;
    }

    /* JADX INFO: renamed from: k */
    public void m191418k() {
        RoomPusherPreviewView roomPusherPreviewView = this.f174576c;
        if (roomPusherPreviewView != null) {
            roomPusherPreviewView.f52364a.removeAllViews();
        }
        c0s c0sVar = this.f174574a;
        if (c0sVar != null) {
            c0sVar.dismiss();
            this.f174574a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public FrameLayout m191419l() {
        return this.f174576c.f52364a;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m191420m(String str, View view) {
        this.f174575b.m206809t4(str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m191421n(String str, View view) {
        this.f174575b.m206808s4(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m191422p(View view) {
        this.f174575b.m206802e5();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m191423q(View view) {
        this.f174575b.m206804o4();
    }

    /* JADX INFO: renamed from: s */
    public void m191424s(String str) {
        if (this.f174574a == null) {
            m191416i(str);
        }
        this.f174574a.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
