package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpTagView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class gjf extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f103026f;

    /* JADX INFO: renamed from: g */
    public VImage f103027g;

    /* JADX INFO: renamed from: h */
    public VImage f103028h;

    /* JADX INFO: renamed from: i */
    public FlowTagsView f103029i;

    /* JADX INFO: renamed from: j */
    public final Act f103030j;

    /* JADX INFO: renamed from: k */
    public final boolean f103031k;

    /* JADX INFO: renamed from: l */
    public cwf0 f103032l;

    public gjf(@NonNull Act act, boolean z) {
        super(act);
        this.f103030j = act;
        this.f103031k = z;
    }

    /* JADX INFO: renamed from: E */
    private void m126484E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f103026f.post(new Runnable() { // from class: l.bjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f75901a.m126486I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17091a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: H */
    private void m126485H() {
        setContentView(m126493D(LayoutInflater.from(this.f103030j), null));
        xdl0.m208329E0(this.f103027g, new View.OnClickListener() { // from class: l.cjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81175a.m126487K(view);
            }
        });
        List<NewTags> listM182838v = sa40.m182802o().m182838v(sth0.m185950b().m185952c());
        boolean zM200296J = vwb.m200296J(listM182838v);
        FlowTagsView flowTagsView = this.f103029i;
        if (zM200296J) {
            xdl0.m208344M(flowTagsView, false);
        } else {
            xdl0.m208344M(flowTagsView, true);
            this.f103029i.setTags(m126495G(listM182838v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m126486I() {
        getBehavior().setPeekHeight(this.f103026f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m126487K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m126488L(DialogInterface dialogInterface) {
        i0e.m133796e(this.f103032l);
    }

    /* JADX INFO: renamed from: M */
    public static void m126489M(Act act, boolean z, boolean z2) {
        if (z) {
            sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
        }
        if (vwb.m200296J(sa40.m182802o().m182838v(sth0.m185950b().m185952c()))) {
            return;
        }
        new gjf(act, z2).show();
    }

    /* JADX INFO: renamed from: D */
    public View m126493D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hjf.m131370b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public View m126494F(final NewTags newTags, final HashMap<String, String> map) {
        ExpTagView expTagView = new ExpTagView(this.f103030j);
        int i = xdl0.f192404f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        String str = (String) vwb.m200346r(newTags.categories, new w9j() { // from class: l.djf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(map.get((String) obj) != null);
            }
        });
        expTagView.m50962e(newTags.name, str == null ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png" : map.get(str));
        xdl0.m208329E0(expTagView, new View.OnClickListener() { // from class: l.ejf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91716a.m126496J(newTags, view);
            }
        });
        return expTagView;
    }

    /* JADX INFO: renamed from: G */
    public List<View> m126495G(List<NewTags> list) {
        HashMap<String, String> mapM188696Z = tff.m188696Z();
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.m81303a(newTags)) {
                arrayList.add(m126494F(newTags, mapM188696Z));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m126496J(NewTags newTags, View view) {
        zvf0.m220396r("e_click_tag_add_photo", "p_choose_mytag");
        wn90.m204602F().m204668r0(this.f103030j, this.f103031k, newTags, new Runnable() { // from class: l.fjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f97775a.dismiss();
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m126485H();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_choose_mytag", Dialog.class.getName());
        this.f103032l = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ajf
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f70112a.m126488L(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m126484E();
    }

    /* JADX INFO: renamed from: l.gjf$a */
    public class C17091a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f103033a;

        public C17091a(BottomSheetBehavior bottomSheetBehavior) {
            this.f103033a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f103033a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gjf.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
