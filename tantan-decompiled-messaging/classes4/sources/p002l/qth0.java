package p002l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategoriesDetail;
import com.p1.mobile.putong.core.data.NewTags;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.f6c0;
import l.i0e;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.qib0;
import l.rth0;
import l.sth0;
import l.u4c0;
import l.upa;
import l.vwb;
import l.wn90;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qth0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f18213f;

    /* JADX INFO: renamed from: g */
    public VImage f18214g;

    /* JADX INFO: renamed from: h */
    public FlowTagsView f18215h;

    /* JADX INFO: renamed from: i */
    public final Act f18216i;

    /* JADX INFO: renamed from: j */
    public final boolean f18217j;

    /* JADX INFO: renamed from: k */
    public cwf0 f18218k;

    /* JADX INFO: renamed from: l */
    public List<CategoriesDetail> f18219l;

    public qth0(@NonNull Act act, boolean z) {
        super(act);
        this.f18219l = new ArrayList();
        this.f18216i = act;
        this.f18217j = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m21542E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f18213f.post(new Runnable() { // from class: l.lth0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15053a.m21544I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0792a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: H */
    private void m21543H() {
        setContentView(m21551D(LayoutInflater.from(this.f18216i), null));
        xdl0.E0(this.f18214g, new View.OnClickListener() { // from class: l.mth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15626a.m21545K(view);
            }
        });
        List<NewTags> listM22306v = sa40.m22270o().m22306v(sth0.b().c());
        boolean zJ = vwb.J(listM22306v);
        FlowTagsView flowTagsView = this.f18215h;
        if (zJ) {
            xdl0.M(flowTagsView, false);
        } else {
            xdl0.M(flowTagsView, true);
            this.f18215h.setTags(m21553G(listM22306v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m21544I() {
        getBehavior().setPeekHeight(this.f18213f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m21545K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m21546L(DialogInterface dialogInterface) {
        i0e.e(this.f18218k);
    }

    /* JADX INFO: renamed from: M */
    public static void m21547M(Act act, boolean z, boolean z2) {
        if (z) {
            sth0.b().e(CoreModule.c.e0.na().clone());
        }
        if (vwb.J(sa40.m22270o().m22306v(sth0.b().c()))) {
            return;
        }
        new qth0(act, z2).show();
    }

    /* JADX INFO: renamed from: D */
    public View m21551D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rth0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public View m21552F(final NewTags newTags) {
        View viewInflate = this.f18216i.inflater().inflate(f6c0.Fa, (ViewGroup) null);
        xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.nth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16191a.m21554J(newTags, view);
            }
        });
        final VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.L5);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        if (upa.L3()) {
            viewInflate.setBackgroundResource(x2c0.F6);
        }
        if (!TextUtils.isEmpty(newTags.icon)) {
            vDraweeViewFindViewById.post(new Runnable() { // from class: l.oth0
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.G.L0(vDraweeViewFindViewById, newTags.icon);
                }
            });
        }
        vTextFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        vTextFindViewById.setText(newTags.name);
        if (newTags.localTagUserCounts == 0) {
            xdl0.M(vTextFindViewById2, false);
            return viewInflate;
        }
        vTextFindViewById2.setText(sa40.m22270o().m22297l(newTags.localTagUserCounts));
        xdl0.M(vTextFindViewById2, true);
        return viewInflate;
    }

    /* JADX INFO: renamed from: G */
    public List<View> m21553G(List<NewTags> list) {
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.a(newTags)) {
                arrayList.add(m21552F(newTags));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m21554J(NewTags newTags, View view) {
        zvf0.r("e_click_tag_add_photo", "p_choose_mytag");
        wn90.F().r0(this.f18216i, this.f18217j, newTags, new Runnable() { // from class: l.pth0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17642a.dismiss();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m21543H();
        cwf0 cwf0VarC = i0e.c("p_choose_mytag", Dialog.class.getName());
        this.f18218k = cwf0VarC;
        i0e.f(cwf0VarC);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kth0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14510a.m21546L(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m21542E();
    }

    /* JADX INFO: renamed from: l.qth0$a */
    public class C0792a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f18220a;

        public C0792a(BottomSheetBehavior bottomSheetBehavior) {
            this.f18220a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f18220a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                qth0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
