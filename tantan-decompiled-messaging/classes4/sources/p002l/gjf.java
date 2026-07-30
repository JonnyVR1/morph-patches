package p002l;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpTagView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.NewTags;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.cwf0;
import l.hjf;
import l.i0e;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.sth0;
import l.vwb;
import l.w9j;
import l.wn90;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gjf extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f11467f;

    /* JADX INFO: renamed from: g */
    public VImage f11468g;

    /* JADX INFO: renamed from: h */
    public VImage f11469h;

    /* JADX INFO: renamed from: i */
    public FlowTagsView f11470i;

    /* JADX INFO: renamed from: j */
    public final Act f11471j;

    /* JADX INFO: renamed from: k */
    public final boolean f11472k;

    /* JADX INFO: renamed from: l */
    public cwf0 f11473l;

    public gjf(@NonNull Act act, boolean z) {
        super(act);
        this.f11471j = act;
        this.f11472k = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m13852E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f11467f.post(new Runnable() { // from class: l.bjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f8186a.m13854I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0592a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: H */
    private void m13853H() {
        setContentView(m13861D(LayoutInflater.from(this.f11471j), null));
        xdl0.E0(this.f11468g, new View.OnClickListener() { // from class: l.cjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8690a.m13855K(view);
            }
        });
        List<NewTags> listM22306v = sa40.m22270o().m22306v(sth0.b().c());
        boolean zJ = vwb.J(listM22306v);
        FlowTagsView flowTagsView = this.f11470i;
        if (zJ) {
            xdl0.M(flowTagsView, false);
        } else {
            xdl0.M(flowTagsView, true);
            this.f11470i.setTags(m13863G(listM22306v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m13854I() {
        getBehavior().setPeekHeight(this.f11467f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m13855K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m13856L(DialogInterface dialogInterface) {
        i0e.e(this.f11473l);
    }

    /* JADX INFO: renamed from: M */
    public static void m13857M(Act act, boolean z, boolean z2) {
        if (z) {
            sth0.b().e(CoreModule.c.e0.na().clone());
        }
        if (vwb.J(sa40.m22270o().m22306v(sth0.b().c()))) {
            return;
        }
        new gjf(act, z2).show();
    }

    /* JADX INFO: renamed from: D */
    public View m13861D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hjf.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.exp.ExpTagView] */
    /* JADX INFO: renamed from: F */
    public View m13862F(final NewTags newTags, final HashMap<String, String> map) {
        ?? expTagView = new ExpTagView(this.f11471j);
        int i = xdl0.f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        String str = (String) vwb.r(newTags.categories, new w9j() { // from class: l.djf
            public final Object call(Object obj) {
                return Boolean.valueOf(map.get((String) obj) != null);
            }
        });
        expTagView.m1410e(newTags.name, str == null ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png" : map.get(str));
        xdl0.E0((View) expTagView, new View.OnClickListener() { // from class: l.ejf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9824a.m13864J(newTags, view);
            }
        });
        return expTagView;
    }

    /* JADX INFO: renamed from: G */
    public List<View> m13863G(List<NewTags> list) {
        HashMap<String, String> mapM22932Z = tff.m22932Z();
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.a(newTags)) {
                arrayList.add(m13862F(newTags, mapM22932Z));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m13864J(NewTags newTags, View view) {
        zvf0.r("e_click_tag_add_photo", "p_choose_mytag");
        wn90.F().r0(this.f11471j, this.f11472k, newTags, new Runnable() { // from class: l.fjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f10425a.dismiss();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m13853H();
        cwf0 cwf0VarC = i0e.c("p_choose_mytag", Dialog.class.getName());
        this.f11473l = cwf0VarC;
        i0e.f(cwf0VarC);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ajf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7661a.m13856L(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m13852E();
    }

    /* JADX INFO: renamed from: l.gjf$a */
    public class C0592a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f11474a;

        public C0592a(BottomSheetBehavior bottomSheetBehavior) {
            this.f11474a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f11474a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gjf.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
