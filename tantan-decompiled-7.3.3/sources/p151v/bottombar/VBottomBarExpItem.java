package p151v.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import java.util.Objects;
import p151v.RedPointView;
import p151v.VImage;
import p151v.VOnlineIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.gec0;
import p153l.vcc0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarExpItem extends VBottomBarDefaultItem {

    /* JADX INFO: renamed from: h */
    public View f210457h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f210458i;

    /* JADX INFO: renamed from: j */
    public String f210459j;

    /* JADX INFO: renamed from: v.bottombar.VBottomBarExpItem$a */
    public class C22704a extends AnimListener {
        public C22704a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(VBottomBarExpItem.this.f210458i, false);
            bnl0.m105524M(VBottomBarExpItem.this.f210457h, true);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(VBottomBarExpItem.this.f210458i, true);
            bnl0.m105524M(VBottomBarExpItem.this.f210457h, false);
        }
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarExpItem$b */
    public class C22705b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f210461a;

        public C22705b(boolean z) {
            this.f210461a = z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f210461a) {
                VBottomBarExpItem.this.f210458i.startAnimation();
            }
        }
    }

    public VBottomBarExpItem(Context context) {
        super(context);
        mo41503c();
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: b */
    public void mo224613b() {
        super.mo224613b();
        boolean z = this.f210456g;
        C22709a c22709a = this.f210450a;
        m224616g(z ? c22709a.f210493g : c22709a.f210492f, 1, false);
        mo40665d(isSelected(), false);
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo41503c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(gec0.f103790c, (ViewGroup) this, true);
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.f210451b = (VText) viewInflate.findViewById(vcc0.f183425k0);
        this.f210457h = viewInflate.findViewById(vcc0.f183395U);
        this.f210458i = (SVGAnimationView) viewInflate.findViewById(vcc0.f183378L0);
        this.f210452c = (RedPointView) findViewById(vcc0.f183416g);
        this.f210453d = (VOnlineIndicator) findViewById(vcc0.f183402Y);
        this.f210454e = (VImage) findViewById(vcc0.f183367G);
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: d */
    public void mo40665d(boolean z, boolean z2) {
        Objects.toString(getTag());
        this.f210458i.isAnimating();
        if (z) {
            if (z2) {
                this.f210458i.startAnimation();
                this.f210457h.setBackgroundResource(this.f210450a.f210490d);
            } else {
                this.f210457h.setBackgroundResource(this.f210450a.f210490d);
            }
            boolean z3 = this.f210456g;
            VText vText = this.f210451b;
            if (z3) {
                vText.setTextColor(getResources().getColor(z8c0.f203362w));
            } else {
                vText.setTextColor(getResources().getColor(z8c0.f203351l));
            }
            this.f210451b.setTypeface(null, 1);
        } else {
            boolean z4 = this.f210456g;
            View view = this.f210457h;
            if (z4) {
                view.setBackgroundResource(this.f210450a.f210491e);
                this.f210451b.setTextColor(getResources().getColor(z8c0.f203361v));
            } else {
                view.setBackgroundResource(this.f210450a.f210489c);
                this.f210451b.setTextColor(getResources().getColor(z8c0.f203354o));
            }
            this.f210451b.setTypeface(null, 0);
        }
        C22709a.a aVar = this.f210450a.f210495i;
        if (aVar != null) {
            int i = aVar.f210497b;
            String str = this.f210456g ? aVar.f210501f : aVar.f210500e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m224616g(str, i, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m224616g(String str, int i, boolean z) {
        if (!TextUtils.equals(str, this.f210459j)) {
            this.f210459j = str;
            SVGALoader.with(getContext()).from(this.f210459j).autoPlay(false).repeatCount(i).loadCallback(new C22705b(z)).animListener(new C22704a()).into(this.f210458i);
        } else if (z) {
            this.f210458i.startAnimation();
        }
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    public View getIconView() {
        return this.f210457h;
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    public void setDarkMode(boolean z) {
        super.setDarkMode(z);
        mo224613b();
    }

    public VBottomBarExpItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo41503c();
    }

    public VBottomBarExpItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo41503c();
    }
}
