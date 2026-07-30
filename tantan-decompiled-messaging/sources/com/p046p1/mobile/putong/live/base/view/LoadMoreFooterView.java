package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.R$string;
import p149l.nrv;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LoadMoreFooterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f44760a;

    /* JADX INFO: renamed from: b */
    public LiveFooterTipsView f44761b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12477b f44762c;

    /* JADX INFO: renamed from: d */
    public boolean f44763d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoadMoreFooterView$a */
    public class ViewOnClickListenerC12476a implements View.OnClickListener {
        public ViewOnClickListenerC12476a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoadMoreFooterView.this.f44760a.setVisibility(0);
            LoadMoreFooterView.this.f44761b.setVisibility(8);
            if (LoadMoreFooterView.this.f44762c != null) {
                LoadMoreFooterView.this.f44762c.mo67642e();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoadMoreFooterView$b */
    public interface InterfaceC12477b {
        /* JADX INFO: renamed from: e */
        void mo67642e();
    }

    public LoadMoreFooterView(@NonNull Context context) {
        super(context);
        this.f44763d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m68788b(View view) {
        nrv.m160747a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m68789c(boolean z) {
        m68790d(z, getContext().getString(R$string.f44221y));
    }

    /* JADX INFO: renamed from: d */
    public void m68790d(boolean z, String str) {
        this.f44761b.setClickable(false);
        LinearLayout linearLayout = this.f44760a;
        if (z) {
            linearLayout.setVisibility(0);
            this.f44761b.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
            this.f44761b.setVisibility(0);
            this.f44761b.m68728Q(this.f44763d, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m68791e() {
        this.f44761b.setClickable(true);
        this.f44760a.setVisibility(8);
        this.f44761b.setVisibility(8);
        boolean zIsConnected = Network.isConnected(App.f15369e);
        LiveFooterTipsView liveFooterTipsView = this.f44761b;
        if (zIsConnected) {
            liveFooterTipsView.m68728Q(this.f44763d, getContext().getString(R$string.f44212v));
        } else {
            liveFooterTipsView.m68728Q(this.f44763d, getContext().getString(R$string.f44164f));
        }
        xdl0.m208329E0(this.f44761b, new ViewOnClickListenerC12476a());
    }

    /* JADX INFO: renamed from: f */
    public void m68792f(boolean z) {
        m68793g(z, getContext().getString(R$string.f44221y));
    }

    /* JADX INFO: renamed from: g */
    public void m68793g(boolean z, String str) {
        LinearLayout linearLayout = this.f44760a;
        if (z) {
            linearLayout.setVisibility(8);
            this.f44761b.setVisibility(8);
        } else {
            linearLayout.setVisibility(8);
            this.f44761b.setVisibility(0);
            this.f44761b.m68728Q(this.f44763d, str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68788b(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public void setIsHalf(boolean z) {
        this.f44763d = z;
    }

    public void setReloadListener(InterfaceC12477b interfaceC12477b) {
        this.f44762c = interfaceC12477b;
    }

    public LoadMoreFooterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44763d = false;
    }

    public LoadMoreFooterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44763d = false;
    }
}
