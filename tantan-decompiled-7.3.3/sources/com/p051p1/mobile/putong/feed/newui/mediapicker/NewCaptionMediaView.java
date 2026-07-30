package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumPreviewNoEditAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VListCell;
import p153l.bnl0;
import p153l.hdc0;
import p153l.j4h;
import p153l.l51;
import p153l.qa00;
import p153l.uqb0;
import p153l.w30;
import p153l.xl80;
import p153l.y0m;

/* JADX INFO: loaded from: classes13.dex */
public class NewCaptionMediaView extends VFrame {

    /* JADX INFO: renamed from: e */
    public static int f41316e = 32;

    /* JADX INFO: renamed from: f */
    public static int f41317f = 2;

    /* JADX INFO: renamed from: g */
    public static int f41318g;

    /* JADX INFO: renamed from: h */
    public static int f41319h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f41320a;

    /* JADX INFO: renamed from: b */
    public ImageView f41321b;

    /* JADX INFO: renamed from: c */
    public ImageView f41322c;

    /* JADX INFO: renamed from: d */
    public w30 f41323d;

    static {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(f41316e);
        f41318g = iM105592y0;
        f41319h = (iM105592y0 - (qa00.m175859d(f41317f) * 3)) / 3;
    }

    public NewCaptionMediaView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m63646z(View view) {
        this.f41323d.m204614b();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m63647B(ArrayList arrayList, Object obj, xl80 xl80Var, y0m y0mVar, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
            arrayList.remove(iIndexOf);
            xl80Var.notifyDataSetChanged();
            y0mVar.mo64068a();
        }
        this.f41323d.m204614b();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m63648C(View view, final ArrayList arrayList, final Object obj, final xl80 xl80Var, final y0m y0mVar) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R$string.f39907g));
        w30.C21001b c21001b = new w30.C21001b(view.getContext());
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.rq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f164426a.m63646z(view2);
            }
        }).m204665Q(arrayList2).m204670V(new w30.InterfaceC21003d() { // from class: l.sq20
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f170127a.m63647B(arrayList, obj, xl80Var, y0mVar, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f41323d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m63649E(PutongAct putongAct, final ArrayList arrayList, final Object obj, final xl80 xl80Var, final y0m y0mVar, final View view) {
        putongAct.hideInput();
        if (NullChecker.m82486a(this.f41323d)) {
            this.f41323d.m204614b();
        }
        l51.m152888H(putongAct, new Runnable() { // from class: l.qq20
            @Override // java.lang.Runnable
            public final void run() {
                this.f158943a.m63648C(view, arrayList, obj, xl80Var, y0mVar);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: F */
    public void m63650F(final PutongAct putongAct, final y0m y0mVar, final ArrayList<Media> arrayList, final Object obj, final xl80 xl80Var, int i, boolean z) {
        bnl0.m105509E0(j4h.m143424h() ? this.f41322c : this.f41321b, new View.OnClickListener() { // from class: l.oq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148535a.m63649E(putongAct, arrayList, obj, xl80Var, y0mVar, view);
            }
        });
        uqb0.f180374G.m98798o(this.f41320a);
        if (obj instanceof Media) {
            uqb0.f180374G.m127150m0(this.f41320a, ((Media) obj).url);
        }
        if (z) {
            return;
        }
        bnl0.m105509E0(this.f41320a, new View.OnClickListener() { // from class: l.pq20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PutongAct putongAct2 = putongAct;
                putongAct2.startActivity(NewAlbumPreviewNoEditAct.m63510h2(putongAct2, (Media) obj, arrayList));
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f41320a = (VDraweeView) findViewById(hdc0.f108942m0);
        this.f41321b = (ImageView) findViewById(hdc0.f108831F);
        this.f41322c = (ImageView) findViewById(hdc0.f108834G);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41320a.getLayoutParams();
        layoutParams.height = f41319h - qa00.m175859d(6.0f);
        layoutParams.width = f41319h - qa00.m175859d(6.0f);
        this.f41320a.setLayoutParams(layoutParams);
        bnl0.m105524M(this.f41321b, !j4h.m143424h());
        bnl0.m105524M(this.f41322c, j4h.m143424h());
    }

    public void setImageDeleteVisible(boolean z) {
        bnl0.m105524M(j4h.m143424h() ? this.f41322c : this.f41321b, z);
    }

    public NewCaptionMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewCaptionMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
