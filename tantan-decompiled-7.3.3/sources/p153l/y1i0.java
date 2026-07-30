package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CategoriesDetail;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class y1i0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f197103f;

    /* JADX INFO: renamed from: g */
    public VImage f197104g;

    /* JADX INFO: renamed from: h */
    public FlowTagsView f197105h;

    /* JADX INFO: renamed from: i */
    public final Act f197106i;

    /* JADX INFO: renamed from: j */
    public final boolean f197107j;

    /* JADX INFO: renamed from: k */
    public l4g0 f197108k;

    /* JADX INFO: renamed from: l */
    public List<CategoriesDetail> f197109l;

    public y1i0(@NonNull Act act, boolean z) {
        super(act);
        this.f197109l = new ArrayList();
        this.f197106i = act;
        this.f197107j = z;
    }

    /* JADX INFO: renamed from: E */
    private void m213943E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f197103f.post(new Runnable() { // from class: l.t1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171673a.m213945I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C21490a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: H */
    private void m213944H() {
        setContentView(m213952D(LayoutInflater.from(this.f197106i), null));
        bnl0.m105509E0(this.f197104g, new View.OnClickListener() { // from class: l.u1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177004a.m213946K(view);
            }
        });
        List<NewTags> listM130451v = gj40.m130415o().m130451v(a2i0.m95674b().m95676c());
        boolean zM147479J = jyb.m147479J(listM130451v);
        FlowTagsView flowTagsView = this.f197105h;
        if (zM147479J) {
            bnl0.m105524M(flowTagsView, false);
        } else {
            bnl0.m105524M(flowTagsView, true);
            this.f197105h.setTags(m213954G(listM130451v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m213945I() {
        getBehavior().setPeekHeight(this.f197103f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m213946K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m213947L(DialogInterface dialogInterface) {
        w1e.m204401e(this.f197108k);
    }

    /* JADX INFO: renamed from: M */
    public static void m213948M(Act act, boolean z, boolean z2) {
        if (z) {
            a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
        }
        if (jyb.m147479J(gj40.m130415o().m130451v(a2i0.m95674b().m95676c()))) {
            return;
        }
        new y1i0(act, z2).show();
    }

    /* JADX INFO: renamed from: D */
    public View m213952D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z1i0.m218347b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public View m213953F(final NewTags newTags) {
        View viewInflate = this.f197106i.inflater().inflate(kec0.f125523Ma, (ViewGroup) null);
        bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.v1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181976a.m213955J(newTags, view);
            }
        });
        final VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        if (gra.m131596L3()) {
            viewInflate.setBackgroundResource(dbc0.f86175G6);
        }
        if (!TextUtils.isEmpty(newTags.icon)) {
            vDraweeView.post(new Runnable() { // from class: l.w1i0
                @Override // java.lang.Runnable
                public final void run() {
                    uqb0.f180374G.m127115L0(vDraweeView, newTags.icon);
                }
            });
        }
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(newTags.name);
        if (newTags.localTagUserCounts == 0) {
            bnl0.m105524M(vText2, false);
            return viewInflate;
        }
        vText2.setText(gj40.m130415o().m130442l(newTags.localTagUserCounts));
        bnl0.m105524M(vText2, true);
        return viewInflate;
    }

    /* JADX INFO: renamed from: G */
    public List<View> m213954G(List<NewTags> list) {
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.m82486a(newTags)) {
                arrayList.add(m213953F(newTags));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m213955J(NewTags newTags, View view) {
        i4g0.m138520r("e_click_tag_add_photo", "p_choose_mytag");
        aw90.m100562F().m100628r0(this.f197106i, this.f197107j, newTags, new Runnable() { // from class: l.x1i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192063a.dismiss();
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m213944H();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_choose_mytag", Dialog.class.getName());
        this.f197108k = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s1i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f165793a.m213947L(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m213943E();
    }

    /* JADX INFO: renamed from: l.y1i0$a */
    public class C21490a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f197110a;

        public C21490a(BottomSheetBehavior bottomSheetBehavior) {
            this.f197110a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f197110a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                y1i0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
