package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherPreviewView;

/* JADX INFO: loaded from: classes5.dex */
public class rbd0 implements s7m<ucd0> {

    /* JADX INFO: renamed from: a */
    public byr f158597a;

    /* JADX INFO: renamed from: b */
    public ucd0 f158598b;

    /* JADX INFO: renamed from: c */
    public RoomPusherPreviewView f158599c;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f158598b.act();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f158598b.act();
    }

    /* JADX INFO: renamed from: e */
    public void m178584e() {
        xdl0.m208344M(this.f158599c.f51518c, false);
        xdl0.m208344M(this.f158599c.f51517b, true);
        xdl0.m208344M(this.f158599c.f51516a, true);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ucd0 ucd0Var) {
        this.f158598b = ucd0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m178586i(final String str) {
        this.f158599c = m178587j();
        BeautyMenuView beautyMenuView = (BeautyMenuView) getAct().inflater().inflate(t6c0.f168479q, (ViewGroup) null);
        this.f158598b.f175814i.m211068Y3(beautyMenuView.f51450e, null);
        this.f158597a = new byr(this.f158598b, beautyMenuView);
        xdl0.m208344M(beautyMenuView.f51449d, true);
        xdl0.m208344M(beautyMenuView.f51451f, true);
        beautyMenuView.f51449d.setOnClickListener(new View.OnClickListener() { // from class: l.nbd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138025a.m178590m(str, view);
            }
        });
        beautyMenuView.f51451f.setOnClickListener(new View.OnClickListener() { // from class: l.obd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142898a.m178591n(str, view);
            }
        });
        xdl0.m208344M(beautyMenuView.f51451f, true);
        int iM186890d = t100.m186890d(166.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM186890d, iM186890d);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = t100.m186890d(10.0f);
        beautyMenuView.f51452g.addView(this.f158599c, layoutParams);
        this.f158597a.m71772d0(false);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final RoomPusherPreviewView m178587j() {
        RoomPusherPreviewView roomPusherPreviewView = (RoomPusherPreviewView) getAct().inflater().inflate(t6c0.f168381i5, (ViewGroup) null);
        xdl0.m208344M(roomPusherPreviewView, true);
        xdl0.m208344M(roomPusherPreviewView.f51517b, false);
        xdl0.m208344M(roomPusherPreviewView.f51516a, false);
        roomPusherPreviewView.f51517b.setOnClickListener(new View.OnClickListener() { // from class: l.pbd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148075a.m178592p(view);
            }
        });
        roomPusherPreviewView.setBackgroundResource(i3c0.f110729H7);
        roomPusherPreviewView.f51518c.setOnClickListener(new View.OnClickListener() { // from class: l.qbd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153641a.m178593q(view);
            }
        });
        return roomPusherPreviewView;
    }

    /* JADX INFO: renamed from: k */
    public void m178588k() {
        RoomPusherPreviewView roomPusherPreviewView = this.f158599c;
        if (roomPusherPreviewView != null) {
            roomPusherPreviewView.f51516a.removeAllViews();
        }
        byr byrVar = this.f158597a;
        if (byrVar != null) {
            byrVar.dismiss();
            this.f158597a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public FrameLayout m178589l() {
        return this.f158599c.f51516a;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m178590m(String str, View view) {
        this.f158598b.m193076t4(str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m178591n(String str, View view) {
        this.f158598b.m193075s4(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m178592p(View view) {
        this.f158598b.m193069e5();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m178593q(View view) {
        this.f158598b.m193071o4();
    }

    /* JADX INFO: renamed from: s */
    public void m178594s(String str) {
        if (this.f158597a == null) {
            m178586i(str);
        }
        this.f158597a.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
