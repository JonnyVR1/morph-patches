package p147v.bottombar;

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
import p147v.RedPointView;
import p147v.VImage;
import p147v.VOnlineIndicator;
import p147v.VText;
import p149l.b6c0;
import p149l.p4c0;
import p149l.t0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarExpItem extends VBottomBarDefaultItem {

    /* JADX INFO: renamed from: h */
    public View f209535h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f209536i;

    /* JADX INFO: renamed from: j */
    public String f209537j;

    /* JADX INFO: renamed from: v.bottombar.VBottomBarExpItem$a */
    public class C22589a extends AnimListener {
        public C22589a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(VBottomBarExpItem.this.f209536i, false);
            xdl0.m208344M(VBottomBarExpItem.this.f209535h, true);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(VBottomBarExpItem.this.f209536i, true);
            xdl0.m208344M(VBottomBarExpItem.this.f209535h, false);
        }
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBarExpItem$b */
    public class C22590b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f209539a;

        public C22590b(boolean z) {
            this.f209539a = z;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            if (this.f209539a) {
                VBottomBarExpItem.this.f209536i.startAnimation();
            }
        }
    }

    public VBottomBarExpItem(Context context) {
        super(context);
        mo40492c();
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: b */
    public void mo223367b() {
        super.mo223367b();
        boolean z = this.f209534g;
        C22594a c22594a = this.f209528a;
        m223370g(z ? c22594a.f209571g : c22594a.f209570f, 1, false);
        mo39662d(isSelected(), false);
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo40492c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(b6c0.f73777c, (ViewGroup) this, true);
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.f209529b = (VText) viewInflate.findViewById(p4c0.f147125k0);
        this.f209535h = viewInflate.findViewById(p4c0.f147095U);
        this.f209536i = (SVGAnimationView) viewInflate.findViewById(p4c0.f147078L0);
        this.f209530c = (RedPointView) findViewById(p4c0.f147116g);
        this.f209531d = (VOnlineIndicator) findViewById(p4c0.f147102Y);
        this.f209532e = (VImage) findViewById(p4c0.f147067G);
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: d */
    public void mo39662d(boolean z, boolean z2) {
        Objects.toString(getTag());
        this.f209536i.isAnimating();
        if (z) {
            if (z2) {
                this.f209536i.startAnimation();
                this.f209535h.setBackgroundResource(this.f209528a.f209568d);
            } else {
                this.f209535h.setBackgroundResource(this.f209528a.f209568d);
            }
            boolean z3 = this.f209534g;
            VText vText = this.f209529b;
            if (z3) {
                vText.setTextColor(getResources().getColor(t0c0.f167171w));
            } else {
                vText.setTextColor(getResources().getColor(t0c0.f167160l));
            }
            this.f209529b.setTypeface(null, 1);
        } else {
            boolean z4 = this.f209534g;
            View view = this.f209535h;
            if (z4) {
                view.setBackgroundResource(this.f209528a.f209569e);
                this.f209529b.setTextColor(getResources().getColor(t0c0.f167170v));
            } else {
                view.setBackgroundResource(this.f209528a.f209567c);
                this.f209529b.setTextColor(getResources().getColor(t0c0.f167163o));
            }
            this.f209529b.setTypeface(null, 0);
        }
        C22594a.a aVar = this.f209528a.f209573i;
        if (aVar != null) {
            int i = aVar.f209575b;
            String str = this.f209534g ? aVar.f209579f : aVar.f209578e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m223370g(str, i, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m223370g(String str, int i, boolean z) {
        if (!TextUtils.equals(str, this.f209537j)) {
            this.f209537j = str;
            SVGALoader.with(getContext()).from(this.f209537j).autoPlay(false).repeatCount(i).loadCallback(new C22590b(z)).animListener(new C22589a()).into(this.f209536i);
        } else if (z) {
            this.f209536i.startAnimation();
        }
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    public View getIconView() {
        return this.f209535h;
    }

    @Override // p147v.bottombar.VBottomBarDefaultItem
    public void setDarkMode(boolean z) {
        super.setDarkMode(z);
        mo223367b();
    }

    public VBottomBarExpItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo40492c();
    }

    public VBottomBarExpItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo40492c();
    }
}
