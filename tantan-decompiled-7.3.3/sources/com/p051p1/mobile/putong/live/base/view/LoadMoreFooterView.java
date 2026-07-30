package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.R$string;
import p153l.bnl0;
import p153l.otv;

/* JADX INFO: loaded from: classes13.dex */
public class LoadMoreFooterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f45608a;

    /* JADX INFO: renamed from: b */
    public LiveFooterTipsView f45609b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12640b f45610c;

    /* JADX INFO: renamed from: d */
    public boolean f45611d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoadMoreFooterView$a */
    public class ViewOnClickListenerC12639a implements View.OnClickListener {
        public ViewOnClickListenerC12639a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoadMoreFooterView.this.f45608a.setVisibility(0);
            LoadMoreFooterView.this.f45609b.setVisibility(8);
            if (LoadMoreFooterView.this.f45610c != null) {
                LoadMoreFooterView.this.f45610c.mo68825e();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoadMoreFooterView$b */
    public interface InterfaceC12640b {
        /* JADX INFO: renamed from: e */
        void mo68825e();
    }

    public LoadMoreFooterView(@NonNull Context context) {
        super(context);
        this.f45611d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m69971b(View view) {
        otv.m169184a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m69972c(boolean z) {
        m69973d(z, getContext().getString(R$string.f45069y));
    }

    /* JADX INFO: renamed from: d */
    public void m69973d(boolean z, String str) {
        this.f45609b.setClickable(false);
        LinearLayout linearLayout = this.f45608a;
        if (z) {
            linearLayout.setVisibility(0);
            this.f45609b.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
            this.f45609b.setVisibility(0);
            this.f45609b.m69911Q(this.f45611d, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m69974e() {
        this.f45609b.setClickable(true);
        this.f45608a.setVisibility(8);
        this.f45609b.setVisibility(8);
        boolean zIsConnected = Network.isConnected(App.f16088e);
        LiveFooterTipsView liveFooterTipsView = this.f45609b;
        if (zIsConnected) {
            liveFooterTipsView.m69911Q(this.f45611d, getContext().getString(R$string.f45060v));
        } else {
            liveFooterTipsView.m69911Q(this.f45611d, getContext().getString(R$string.f45012f));
        }
        bnl0.m105509E0(this.f45609b, new ViewOnClickListenerC12639a());
    }

    /* JADX INFO: renamed from: f */
    public void m69975f(boolean z) {
        m69976g(z, getContext().getString(R$string.f45069y));
    }

    /* JADX INFO: renamed from: g */
    public void m69976g(boolean z, String str) {
        LinearLayout linearLayout = this.f45608a;
        if (z) {
            linearLayout.setVisibility(8);
            this.f45609b.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
            this.f45609b.setVisibility(0);
            this.f45609b.m69911Q(this.f45611d, str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69971b(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public void setIsHalf(boolean z) {
        this.f45611d = z;
    }

    public void setReloadListener(InterfaceC12640b interfaceC12640b) {
        this.f45610c = interfaceC12640b;
    }

    public LoadMoreFooterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45611d = false;
    }

    public LoadMoreFooterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45611d = false;
    }
}
