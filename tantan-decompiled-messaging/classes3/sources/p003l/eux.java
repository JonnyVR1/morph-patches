package p003l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.fux;
import l.s7m;
import l.t100;
import l.u4c0;
import l.vwb;
import l.xdl0;
import p028v.VCheckCircle;
import p028v.VPager;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class eux implements s7m<ztx> {

    /* JADX INFO: renamed from: a */
    public VPager f3382a;

    /* JADX INFO: renamed from: b */
    public VCheckCircle f3383b;

    /* JADX INFO: renamed from: c */
    public ztx f3384c;

    /* JADX INFO: renamed from: d */
    public ArrayList<Media> f3385d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public xtx f3386e;

    /* JADX INFO: renamed from: f */
    public VText f3387f;

    /* JADX INFO: renamed from: g */
    public View f3388g;

    /* JADX INFO: renamed from: h */
    public MediaPreviewAct f3389h;

    /* JADX INFO: renamed from: i */
    public int f3390i;

    /* JADX INFO: renamed from: l.eux$a */
    public class C0280a extends ViewPager.m {
        public C0280a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void onPageSelected(int i) {
            Media media = eux.this.f3385d.get(i);
            if (NullChecker.a(eux.this.f3384c.m9469g0())) {
                eux euxVar = eux.this;
                euxVar.f3383b.m11476e(euxVar.f3384c.m9469g0().contains(media), false);
                eux.this.f3389h.setTitle((i + 1) + "/" + eux.this.f3385d.size());
            }
            for (int i2 = 0; i2 < eux.this.f3382a.getChildCount(); i2++) {
                if ((eux.this.f3382a.getChildAt(i2) instanceof PictureView) && !eux.this.f3382a.getChildAt(i2).getTag().equals(media)) {
                    ((PictureView) eux.this.f3382a.getChildAt(i2)).U();
                }
            }
        }
    }

    public eux(MediaPreviewAct mediaPreviewAct) {
        this.f3389h = mediaPreviewAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m3940p() {
        MediaPickerAct.m853p2(this.f3388g, this.f3387f, this.f3389h, this.f3384c.f9426b, true);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3932C0() {
        return this.f3389h;
    }

    @Nullable
    public Act act() {
        return this.f3389h;
    }

    /* JADX INFO: renamed from: i */
    public View m3933i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fux.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3933i(layoutInflater, viewGroup);
    }

    public void init() {
        this.f3390i = act().statusBarColor();
        this.f3382a.setPageMargin(t100.d(8.0f));
        if (this.f3384c.m9469g0() == null) {
            this.f3389h.setTitle(R.string.qi);
            this.f3383b.setVisibility(4);
        } else {
            this.f3383b.setSize(40);
            this.f3383b.setOnClickListener(new View.OnClickListener() { // from class: l.dux
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3117a.m3938m(view);
                }
            });
        }
        C0280a c0280a = new C0280a();
        this.f3382a.setOnPageChangeListener(c0280a);
        xtx xtxVar = new xtx(this.f3389h, this.f3385d);
        this.f3386e = xtxVar;
        this.f3382a.setAdapter(xtxVar);
        int i = this.f3389h.f532c;
        if (i > 0) {
            this.f3382a.setCurrentItem(i);
        } else {
            c0280a.onPageSelected(0);
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m3934i1(ztx ztxVar) {
        this.f3384c = ztxVar;
    }

    /* JADX INFO: renamed from: k */
    public void m3936k(ArrayList<Media> arrayList) {
        this.f3385d = new ArrayList<>(arrayList);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.widget.TextView, v.VText] */
    /* JADX INFO: renamed from: l */
    public void m3937l(Menu menu, final ArrayList<Media> arrayList) {
        View actionView = menu.findItem(u4c0.d3).getActionView();
        this.f3388g = actionView;
        ?? r2 = (VText) actionView.findViewById(u4c0.n8);
        this.f3387f = r2;
        if (arrayList == null) {
            r2.setText(R.string.xn);
        } else {
            r2.setText(R.string.k);
        }
        this.f3389h.getAppTheme().j(this.f3387f);
        this.f3388g.setOnClickListener(new View.OnClickListener() { // from class: l.aux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2283a.m3939n(arrayList, view);
            }
        });
        act().post(new Runnable() { // from class: l.bux
            @Override // java.lang.Runnable
            public final void run() {
                this.f2505a.m3940p();
            }
        });
        xdl0.b0(act().findViewById(android.R.id.content), new v9j() { // from class: l.cux
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f2808a.m3941q();
            }
        });
        act().pendChangeActionButtonTypeface();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m3938m(View view) {
        Media media = this.f3385d.get(this.f3382a.getCurrentItem());
        if (this.f3383b.m11475d()) {
            if (m3942u(media, false)) {
                this.f3383b.m11476e(false, true);
            }
        } else if (m3942u(media, true)) {
            this.f3383b.m11476e(true, true);
        }
        m3940p();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m3939n(ArrayList arrayList, View view) {
        if ("vivo".equalsIgnoreCase(Build.BRAND) && "vivo X7".equalsIgnoreCase(Build.MODEL)) {
            ViewPager viewPager = this.f3382a;
            PictureView pictureViewFindViewWithTag = viewPager.findViewWithTag(this.f3385d.get(viewPager.getCurrentItem()));
            if (pictureViewFindViewWithTag instanceof PictureView) {
                pictureViewFindViewWithTag.x(true);
            }
        }
        Intent intent = new Intent();
        if (arrayList == null || arrayList.isEmpty()) {
            intent.putExtra("selectedImages", vwb.f0(new Media[]{this.f3385d.get(this.f3382a.getCurrentItem())}));
        } else {
            intent.putExtra("selectedImages", arrayList);
        }
        intent.putExtra("isDone", true);
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m3941q() {
        m3940p();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public boolean m3942u(Media media, boolean z) {
        if (!MediaPickerAct.m854q2(media, z, this.f3384c.m9469g0(), this.f3384c.m9468f0())) {
            return false;
        }
        m3940p();
        return true;
    }

    public void destroy() {
    }
}
