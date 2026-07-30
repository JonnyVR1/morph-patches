package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpTagView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class mkf extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f137287f;

    /* JADX INFO: renamed from: g */
    public VImage f137288g;

    /* JADX INFO: renamed from: h */
    public VImage f137289h;

    /* JADX INFO: renamed from: i */
    public FlowTagsView f137290i;

    /* JADX INFO: renamed from: j */
    public final Act f137291j;

    /* JADX INFO: renamed from: k */
    public final boolean f137292k;

    /* JADX INFO: renamed from: l */
    public l4g0 f137293l;

    public mkf(@NonNull Act act, boolean z) {
        super(act);
        this.f137291j = act;
        this.f137292k = z;
    }

    /* JADX INFO: renamed from: E */
    private void m158771E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f137287f.post(new Runnable() { // from class: l.hkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f110410a.m158773I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18642a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: H */
    private void m158772H() {
        setContentView(m158780D(LayoutInflater.from(this.f137291j), null));
        bnl0.m105509E0(this.f137288g, new View.OnClickListener() { // from class: l.ikf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115358a.m158774K(view);
            }
        });
        List<NewTags> listM130451v = gj40.m130415o().m130451v(a2i0.m95674b().m95676c());
        boolean zM147479J = jyb.m147479J(listM130451v);
        FlowTagsView flowTagsView = this.f137290i;
        if (zM147479J) {
            bnl0.m105524M(flowTagsView, false);
        } else {
            bnl0.m105524M(flowTagsView, true);
            this.f137290i.setTags(m158782G(listM130451v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m158773I() {
        getBehavior().setPeekHeight(this.f137287f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m158774K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m158775L(DialogInterface dialogInterface) {
        w1e.m204401e(this.f137293l);
    }

    /* JADX INFO: renamed from: M */
    public static void m158776M(Act act, boolean z, boolean z2) {
        if (z) {
            a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
        }
        if (jyb.m147479J(gj40.m130415o().m130451v(a2i0.m95674b().m95676c()))) {
            return;
        }
        new mkf(act, z2).show();
    }

    /* JADX INFO: renamed from: D */
    public View m158780D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nkf.m163603b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public View m158781F(final NewTags newTags, final HashMap<String, String> map) {
        ExpTagView expTagView = new ExpTagView(this.f137291j);
        int i = bnl0.f77545f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        String str = (String) jyb.m147529r(newTags.categories, new qcj() { // from class: l.jkf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(map.get((String) obj) != null);
            }
        });
        expTagView.m52145e(newTags.name, str == null ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png" : map.get(str));
        bnl0.m105509E0(expTagView, new View.OnClickListener() { // from class: l.kkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127185a.m158783J(newTags, view);
            }
        });
        return expTagView;
    }

    /* JADX INFO: renamed from: G */
    public List<View> m158782G(List<NewTags> list) {
        HashMap<String, String> mapM219609Z = zgf.m219609Z();
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.m82486a(newTags)) {
                arrayList.add(m158781F(newTags, mapM219609Z));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m158783J(NewTags newTags, View view) {
        i4g0.m138520r("e_click_tag_add_photo", "p_choose_mytag");
        aw90.m100562F().m100628r0(this.f137291j, this.f137292k, newTags, new Runnable() { // from class: l.lkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f132463a.dismiss();
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m158772H();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_choose_mytag", Dialog.class.getName());
        this.f137293l = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gkf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f104732a.m158775L(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m158771E();
    }

    /* JADX INFO: renamed from: l.mkf$a */
    public class C18642a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f137294a;

        public C18642a(BottomSheetBehavior bottomSheetBehavior) {
            this.f137294a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f137294a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                mkf.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
