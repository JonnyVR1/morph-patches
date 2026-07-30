package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VListCell;
import p149l.b5c0;
import p149l.c40;
import p149l.e51;
import p149l.fyl;
import p149l.od80;
import p149l.qib0;
import p149l.t100;
import p149l.u2h;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class NewCaptionMediaView extends VFrame {

    /* JADX INFO: renamed from: e */
    public static int f40468e = 32;

    /* JADX INFO: renamed from: f */
    public static int f40469f = 2;

    /* JADX INFO: renamed from: g */
    public static int f40470g;

    /* JADX INFO: renamed from: h */
    public static int f40471h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f40472a;

    /* JADX INFO: renamed from: b */
    public ImageView f40473b;

    /* JADX INFO: renamed from: c */
    public ImageView f40474c;

    /* JADX INFO: renamed from: d */
    public c40 f40475d;

    static {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(f40468e);
        f40470g = iM208412y0;
        f40471h = (iM208412y0 - (t100.m186890d(f40469f) * 3)) / 3;
    }

    public NewCaptionMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m62463z(View view) {
        this.f40475d.m105113b();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m62464B(ArrayList arrayList, Object obj, od80 od80Var, fyl fylVar, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
            arrayList.remove(iIndexOf);
            od80Var.notifyDataSetChanged();
            fylVar.mo62885a();
        }
        this.f40475d.m105113b();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m62465C(View view, final ArrayList arrayList, final Object obj, final od80 od80Var, final fyl fylVar) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R$string.f39059g));
        c40.C16057b c16057b = new c40.C16057b(view.getContext());
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.hi20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f107868a.m62463z(view2);
            }
        }).m105164Q(arrayList2).m105169V(new c40.InterfaceC16059d() { // from class: l.ii20
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f113360a.m62464B(arrayList, obj, od80Var, fylVar, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f40475d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m62466E(PutongAct putongAct, final ArrayList arrayList, final Object obj, final od80 od80Var, final fyl fylVar, final View view) {
        putongAct.hideInput();
        if (NullChecker.m81303a(this.f40475d)) {
            this.f40475d.m105113b();
        }
        e51.m114743H(putongAct, new Runnable() { // from class: l.gi20
            @Override // java.lang.Runnable
            public final void run() {
                this.f102831a.m62465C(view, arrayList, obj, od80Var, fylVar);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: F */
    public void m62467F(final PutongAct putongAct, final fyl fylVar, final ArrayList<Media> arrayList, final Object obj, final od80 od80Var, int i, boolean z) {
        xdl0.m208329E0(u2h.m191499h() ? this.f40474c : this.f40473b, new View.OnClickListener() { // from class: l.ei20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91537a.m62466E(putongAct, arrayList, obj, od80Var, fylVar, view);
            }
        });
        qib0.f154691G.m184725o(this.f40472a);
        if (obj instanceof Media) {
            qib0.f154691G.m102367m0(this.f40472a, ((Media) obj).url);
        }
        if (z) {
            return;
        }
        xdl0.m208329E0(this.f40472a, new View.OnClickListener() { // from class: l.fi20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PutongAct putongAct2 = putongAct;
                putongAct2.startActivity(NewAlbumPreviewNoEditAct.m62327g2(putongAct2, (Media) obj, arrayList));
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f40472a = (VDraweeView) findViewById(b5c0.f73589m0);
        this.f40473b = (ImageView) findViewById(b5c0.f73478F);
        this.f40474c = (ImageView) findViewById(b5c0.f73481G);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40472a.getLayoutParams();
        layoutParams.height = f40471h - t100.m186890d(6.0f);
        layoutParams.width = f40471h - t100.m186890d(6.0f);
        this.f40472a.setLayoutParams(layoutParams);
        xdl0.m208344M(this.f40473b, !u2h.m191499h());
        xdl0.m208344M(this.f40474c, u2h.m191499h());
    }

    public void setImageDeleteVisible(boolean z) {
        xdl0.m208344M(u2h.m191499h() ? this.f40474c : this.f40473b, z);
    }

    public NewCaptionMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
