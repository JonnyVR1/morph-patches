package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c40;
import l.e51;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.b5c0;
import p007l.fyl;
import p007l.od80;
import p007l.u2h;
import v.VDraweeView;
import v.VFrame;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewCaptionMediaView extends VFrame {

    /* JADX INFO: renamed from: e */
    public static int f1929e = 32;

    /* JADX INFO: renamed from: f */
    public static int f1930f = 2;

    /* JADX INFO: renamed from: g */
    public static int f1931g;

    /* JADX INFO: renamed from: h */
    public static int f1932h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f1933a;

    /* JADX INFO: renamed from: b */
    public ImageView f1934b;

    /* JADX INFO: renamed from: c */
    public ImageView f1935c;

    /* JADX INFO: renamed from: d */
    public c40 f1936d;

    static {
        int iY0 = xdl0.y0() - t100.d(f1929e);
        f1931g = iY0;
        f1932h = (iY0 - (t100.d(f1930f) * 3)) / 3;
    }

    public NewCaptionMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m3465z(View view) {
        this.f1936d.b();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m3466B(ArrayList arrayList, Object obj, od80 od80Var, fyl fylVar, VListCell vListCell, VListCell.a aVar, int i) {
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
            arrayList.remove(iIndexOf);
            od80Var.notifyDataSetChanged();
            fylVar.mo3893a();
        }
        this.f1936d.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m3467C(View view, final ArrayList arrayList, final Object obj, final od80 od80Var, final fyl fylVar) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R$string.f520g));
        c40.b bVar = new c40.b(view.getContext());
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.hi20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8745a.m3465z(view2);
            }
        }).Q(arrayList2).V(new c40.d() { // from class: l.ii20
            /* JADX INFO: renamed from: a */
            public final void m10872a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f9020a.m3466B(arrayList, obj, od80Var, fylVar, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f1936d = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m3468E(PutongAct putongAct, final ArrayList arrayList, final Object obj, final od80 od80Var, final fyl fylVar, final View view) {
        putongAct.hideInput();
        if (NullChecker.a(this.f1936d)) {
            this.f1936d.b();
        }
        e51.H(putongAct, new Runnable() { // from class: l.gi20
            @Override // java.lang.Runnable
            public final void run() {
                this.f8456a.m3467C(view, arrayList, obj, od80Var, fylVar);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: F */
    public void m3469F(final PutongAct putongAct, final fyl fylVar, final ArrayList<Media> arrayList, final Object obj, final od80 od80Var, int i, boolean z) {
        xdl0.E0(u2h.m14723h() ? this.f1935c : this.f1934b, new View.OnClickListener() { // from class: l.ei20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7393a.m3468E(putongAct, arrayList, obj, od80Var, fylVar, view);
            }
        });
        qib0.G.o(this.f1933a);
        if (obj instanceof Media) {
            qib0.G.m0(this.f1933a, ((Media) obj).url);
        }
        if (z) {
            return;
        }
        xdl0.E0(this.f1933a, new View.OnClickListener() { // from class: l.fi20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PutongAct putongAct2 = putongAct;
                putongAct2.startActivity(NewAlbumPreviewNoEditAct.m3319g2(putongAct2, (Media) obj, arrayList));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f1933a = findViewById(b5c0.f6070m0);
        this.f1934b = (ImageView) findViewById(b5c0.f5959F);
        this.f1935c = (ImageView) findViewById(b5c0.f5962G);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1933a.getLayoutParams();
        layoutParams.height = f1932h - t100.d(6.0f);
        layoutParams.width = f1932h - t100.d(6.0f);
        this.f1933a.setLayoutParams(layoutParams);
        xdl0.M(this.f1934b, !u2h.m14723h());
        xdl0.M(this.f1935c, u2h.m14723h());
    }

    public void setImageDeleteVisible(boolean z) {
        xdl0.M(u2h.m14723h() ? this.f1935c : this.f1934b, z);
    }

    public NewCaptionMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
