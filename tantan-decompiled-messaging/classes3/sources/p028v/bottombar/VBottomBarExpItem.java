package p028v.bottombar;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import java.util.Objects;
import l.b6c0;
import l.p4c0;
import l.t0c0;
import l.xdl0;
import p028v.RedPointView;
import p028v.VImage;
import p028v.VOnlineIndicator;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBottomBarExpItem extends VBottomBarDefaultItem {

    /* JADX INFO: renamed from: h */
    public View f13160h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f13161i;

    /* JADX INFO: renamed from: j */
    public String f13162j;

    /* JADX INFO: renamed from: v.bottombar.VBottomBarExpItem$a */
    public class C1382a extends AnimListener {
        public C1382a() {
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(VBottomBarExpItem.this.f13161i, false);
            xdl0.M(VBottomBarExpItem.this.f13160h, true);
        }

        public void onStart() {
            super.onStart();
            xdl0.M(VBottomBarExpItem.this.f13161i, true);
            xdl0.M(VBottomBarExpItem.this.f13160h, false);
        }
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarExpItem$b */
    public class C1383b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f13164a;

        public C1383b(boolean z) {
            this.f13164a = z;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f13164a) {
                VBottomBarExpItem.this.f13161i.startAnimation();
            }
        }
    }

    public VBottomBarExpItem(Context context) {
        super(context);
        mo11867c();
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: b */
    public void mo11866b() {
        super.mo11866b();
        boolean z = this.f13159g;
        C1387a c1387a = this.f13153a;
        m11871g(z ? c1387a.f13196g : c1387a.f13195f, 1, false);
        mo11868d(isSelected(), false);
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo11867c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(b6c0.c, (ViewGroup) this, true);
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.f13154b = (VText) viewInflate.findViewById(p4c0.k0);
        this.f13160h = viewInflate.findViewById(p4c0.U);
        this.f13161i = viewInflate.findViewById(p4c0.L0);
        this.f13155c = (RedPointView) findViewById(p4c0.g);
        this.f13156d = (VOnlineIndicator) findViewById(p4c0.Y);
        this.f13157e = (VImage) findViewById(p4c0.G);
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
    @Override // p028v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: d */
    public void mo11868d(boolean z, boolean z2) {
        Objects.toString(getTag());
        this.f13161i.isAnimating();
        if (z) {
            if (z2) {
                this.f13161i.startAnimation();
                this.f13160h.setBackgroundResource(this.f13153a.f13193d);
            } else {
                this.f13160h.setBackgroundResource(this.f13153a.f13193d);
            }
            boolean z3 = this.f13159g;
            AppCompatTextView appCompatTextView = this.f13154b;
            if (z3) {
                appCompatTextView.setTextColor(getResources().getColor(t0c0.w));
            } else {
                appCompatTextView.setTextColor(getResources().getColor(t0c0.l));
            }
            this.f13154b.setTypeface((Typeface) null, 1);
        } else {
            boolean z4 = this.f13159g;
            View view = this.f13160h;
            if (z4) {
                view.setBackgroundResource(this.f13153a.f13194e);
                this.f13154b.setTextColor(getResources().getColor(t0c0.v));
            } else {
                view.setBackgroundResource(this.f13153a.f13192c);
                this.f13154b.setTextColor(getResources().getColor(t0c0.o));
            }
            this.f13154b.setTypeface((Typeface) null, 0);
        }
        C1387a.a aVar = this.f13153a.f13198i;
        if (aVar != null) {
            int i = aVar.f13200b;
            String str = this.f13159g ? aVar.f13204f : aVar.f13203e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m11871g(str, i, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11871g(String str, int i, boolean z) {
        if (!TextUtils.equals(str, this.f13162j)) {
            this.f13162j = str;
            SVGALoader.with(getContext()).from(this.f13162j).autoPlay(false).repeatCount(i).loadCallback(new C1383b(z)).animListener(new C1382a()).into(this.f13161i);
        } else if (z) {
            this.f13161i.startAnimation();
        }
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    public View getIconView() {
        return this.f13160h;
    }

    @Override // p028v.bottombar.VBottomBarDefaultItem
    public void setDarkMode(boolean z) {
        super.setDarkMode(z);
        mo11866b();
    }

    public VBottomBarExpItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo11867c();
    }

    public VBottomBarExpItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo11867c();
    }
}
