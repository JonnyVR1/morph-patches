package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CategoriesDetail;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qth0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f156358f;

    /* JADX INFO: renamed from: g */
    public VImage f156359g;

    /* JADX INFO: renamed from: h */
    public FlowTagsView f156360h;

    /* JADX INFO: renamed from: i */
    public final Act f156361i;

    /* JADX INFO: renamed from: j */
    public final boolean f156362j;

    /* JADX INFO: renamed from: k */
    public cwf0 f156363k;

    /* JADX INFO: renamed from: l */
    public List<CategoriesDetail> f156364l;

    public qth0(@NonNull Act act, boolean z) {
        super(act);
        this.f156364l = new ArrayList();
        this.f156361i = act;
        this.f156362j = z;
    }

    /* JADX INFO: renamed from: E */
    private void m176449E() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f156358f.post(new Runnable() { // from class: l.lth0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129967a.m176451I();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C19576a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: H */
    private void m176450H() {
        setContentView(m176458D(LayoutInflater.from(this.f156361i), null));
        xdl0.m208329E0(this.f156359g, new View.OnClickListener() { // from class: l.mth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135601a.m176452K(view);
            }
        });
        List<NewTags> listM182838v = sa40.m182802o().m182838v(sth0.m185950b().m185952c());
        boolean zM200296J = vwb.m200296J(listM182838v);
        FlowTagsView flowTagsView = this.f156360h;
        if (zM200296J) {
            xdl0.m208344M(flowTagsView, false);
        } else {
            xdl0.m208344M(flowTagsView, true);
            this.f156360h.setTags(m176460G(listM182838v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m176451I() {
        getBehavior().setPeekHeight(this.f156358f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m176452K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m176453L(DialogInterface dialogInterface) {
        i0e.m133796e(this.f156363k);
    }

    /* JADX INFO: renamed from: M */
    public static void m176454M(Act act, boolean z, boolean z2) {
        if (z) {
            sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
        }
        if (vwb.m200296J(sa40.m182802o().m182838v(sth0.m185950b().m185952c()))) {
            return;
        }
        new qth0(act, z2).show();
    }

    /* JADX INFO: renamed from: D */
    public View m176458D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rth0.m180784b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public View m176459F(final NewTags newTags) {
        View viewInflate = this.f156361i.inflater().inflate(f6c0.f95357Fa, (ViewGroup) null);
        xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.nth0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140474a.m176461J(newTags, view);
            }
        });
        final VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        if (upa.m194665L3()) {
            viewInflate.setBackgroundResource(x2c0.f189320F6);
        }
        if (!TextUtils.isEmpty(newTags.icon)) {
            vDraweeView.post(new Runnable() { // from class: l.oth0
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.f154691G.m102331L0(vDraweeView, newTags.icon);
                }
            });
        }
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(newTags.name);
        if (newTags.localTagUserCounts == 0) {
            xdl0.m208344M(vText2, false);
            return viewInflate;
        }
        vText2.setText(sa40.m182802o().m182829l(newTags.localTagUserCounts));
        xdl0.m208344M(vText2, true);
        return viewInflate;
    }

    /* JADX INFO: renamed from: G */
    public List<View> m176460G(List<NewTags> list) {
        ArrayList arrayList = new ArrayList();
        for (NewTags newTags : list) {
            if (NullChecker.m81303a(newTags)) {
                arrayList.add(m176459F(newTags));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m176461J(NewTags newTags, View view) {
        zvf0.m220396r("e_click_tag_add_photo", "p_choose_mytag");
        wn90.m204602F().m204668r0(this.f156361i, this.f156362j, newTags, new Runnable() { // from class: l.pth0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151165a.dismiss();
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m176450H();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_choose_mytag", Dialog.class.getName());
        this.f156363k = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kth0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f124590a.m176453L(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m176449E();
    }

    /* JADX INFO: renamed from: l.qth0$a */
    public class C19576a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f156365a;

        public C19576a(BottomSheetBehavior bottomSheetBehavior) {
            this.f156365a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f156365a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                qth0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
