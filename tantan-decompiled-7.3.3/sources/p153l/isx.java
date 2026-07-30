package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes4.dex */
public class isx implements iam<hsx> {

    /* JADX INFO: renamed from: a */
    public hsx f116762a;

    /* JADX INFO: renamed from: b */
    public Act f116763b;

    /* JADX INFO: renamed from: c */
    public WindowManager f116764c;

    /* JADX INFO: renamed from: d */
    public WindowManager.LayoutParams f116765d;

    /* JADX INFO: renamed from: e */
    public WindowManager.LayoutParams f116766e;

    /* JADX INFO: renamed from: f */
    public TextView f116767f;

    /* JADX INFO: renamed from: g */
    public TextView f116768g;

    /* JADX INFO: renamed from: l.isx$a */
    public class ViewOnClickListenerC17798a implements View.OnClickListener {
        public ViewOnClickListenerC17798a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (isx.this.f116768g == null || isx.this.f116768g.getVisibility() != 0) {
                isx.this.f116762a.m137054R3();
            } else {
                isx.this.f116768g.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: l.isx$b */
    public class ViewOnLongClickListenerC17799b implements View.OnLongClickListener {
        public ViewOnLongClickListenerC17799b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            na5.m162056c(isx.this.f116763b).m162057a("anchorMediaData", isx.this.f116768g.getText().toString());
            o1j0.m165651y("已复制到剪切板");
            return false;
        }
    }

    /* JADX INFO: renamed from: l.isx$c */
    public class ViewOnTouchListenerC17800c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public int f116771a;

        /* JADX INFO: renamed from: b */
        public int f116772b;

        /* JADX INFO: renamed from: c */
        public int f116773c;

        public ViewOnTouchListenerC17800c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (isx.this.f116767f == null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.f116771a = (int) motionEvent.getRawY();
                this.f116773c = 0;
            } else if (motionEvent.getAction() == 2) {
                int rawY = (int) motionEvent.getRawY();
                this.f116772b = rawY;
                this.f116773c = rawY - this.f116771a;
                this.f116771a = rawY;
                isx.this.f116765d.y += this.f116773c;
                isx.this.f116764c.updateViewLayout(isx.this.f116767f, isx.this.f116765d);
            } else if (motionEvent.getAction() == 1) {
                isx.this.f116764c.updateViewLayout(isx.this.f116767f, isx.this.f116765d);
            }
            return false;
        }
    }

    public isx(Act act) {
        this.f116763b = act;
        m142006r();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        WindowManager windowManager = this.f116764c;
        if (windowManager != null) {
            TextView textView = this.f116768g;
            if (textView != null) {
                windowManager.removeView(textView);
                this.f116768g = null;
            }
            TextView textView2 = this.f116767f;
            if (textView2 != null) {
                this.f116764c.removeView(textView2);
                this.f116767f = null;
            }
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hsx hsxVar) {
        this.f116762a = hsxVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m142005j(String str) {
        TextView textView = this.f116768g;
        if (textView != null) {
            textView.setText(str);
            this.f116768g.setVisibility(0);
            this.f116764c.updateViewLayout(this.f116768g, this.f116766e);
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f116766e = layoutParams;
        layoutParams.type = 2;
        layoutParams.flags |= 8;
        layoutParams.width = qa00.m175859d(300.0f);
        WindowManager.LayoutParams layoutParams2 = this.f116766e;
        layoutParams2.format = -3;
        layoutParams2.height = qa00.m175859d(300.0f);
        this.f116766e.gravity = 17;
        TextView textView2 = new TextView(this.f116763b);
        this.f116768g = textView2;
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f116768g.setSingleLine(false);
        this.f116768g.setText(str);
        this.f116768g.setTextSize(2, 14.0f);
        this.f116768g.setTextColor(-1);
        this.f116768g.setGravity(3);
        this.f116768g.setBackgroundResource(obc0.f146290c0);
        TextView textView3 = this.f116768g;
        int i = qa00.f156325l;
        textView3.setPadding(i, i, i, i);
        this.f116764c.addView(this.f116768g, this.f116766e);
        this.f116768g.setOnLongClickListener(new ViewOnLongClickListenerC17799b());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m142006r() {
        this.f116764c = this.f116763b.getWindow().getWindowManager();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f116765d = layoutParams;
        layoutParams.type = 99;
        layoutParams.flags |= 8;
        int i = qa00.f156289B;
        layoutParams.width = i;
        layoutParams.format = -3;
        layoutParams.height = i;
        layoutParams.gravity = 8388629;
        TextView textView = new TextView(this.f116763b);
        this.f116767f = textView;
        textView.setFocusable(true);
        this.f116767f.setText("D");
        this.f116767f.setTextSize(2, 20.0f);
        this.f116767f.setTextColor(-65536);
        this.f116767f.setGravity(17);
        this.f116767f.setBackgroundResource(obc0.f146314e0);
        this.f116764c.addView(this.f116767f, this.f116765d);
        this.f116767f.setOnTouchListener(new ViewOnTouchListenerC17800c());
        bnl0.m105509E0(this.f116767f, new ViewOnClickListenerC17798a());
    }
}
