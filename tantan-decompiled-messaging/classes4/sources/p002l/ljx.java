package p002l;

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
import com.p1.mobile.android.app.Act;
import l.lsi0;
import l.m95;
import l.s7m;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ljx implements s7m<kjx> {

    /* JADX INFO: renamed from: a */
    public kjx f14897a;

    /* JADX INFO: renamed from: b */
    public Act f14898b;

    /* JADX INFO: renamed from: c */
    public WindowManager f14899c;

    /* JADX INFO: renamed from: d */
    public WindowManager.LayoutParams f14900d;

    /* JADX INFO: renamed from: e */
    public WindowManager.LayoutParams f14901e;

    /* JADX INFO: renamed from: f */
    public TextView f14902f;

    /* JADX INFO: renamed from: g */
    public TextView f14903g;

    /* JADX INFO: renamed from: l.ljx$a */
    public class ViewOnClickListenerC0661a implements View.OnClickListener {
        public ViewOnClickListenerC0661a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ljx.this.f14903g == null || ljx.this.f14903g.getVisibility() != 0) {
                ljx.this.f14897a.m16653R3();
            } else {
                ljx.this.f14903g.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: l.ljx$b */
    public class ViewOnLongClickListenerC0662b implements View.OnLongClickListener {
        public ViewOnLongClickListenerC0662b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            m95.c(ljx.this.f14898b).a("anchorMediaData", ljx.this.f14903g.getText().toString());
            lsi0.y("已复制到剪切板");
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ljx$c */
    public class ViewOnTouchListenerC0663c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public int f14906a;

        /* JADX INFO: renamed from: b */
        public int f14907b;

        /* JADX INFO: renamed from: c */
        public int f14908c;

        public ViewOnTouchListenerC0663c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (ljx.this.f14902f == null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.f14906a = (int) motionEvent.getRawY();
                this.f14908c = 0;
            } else if (motionEvent.getAction() == 2) {
                int rawY = (int) motionEvent.getRawY();
                this.f14907b = rawY;
                this.f14908c = rawY - this.f14906a;
                this.f14906a = rawY;
                ljx.this.f14900d.y += this.f14908c;
                ljx.this.f14899c.updateViewLayout(ljx.this.f14902f, ljx.this.f14900d);
            } else if (motionEvent.getAction() == 1) {
                ljx.this.f14899c.updateViewLayout(ljx.this.f14902f, ljx.this.f14900d);
            }
            return false;
        }
    }

    public ljx(Act act) {
        this.f14898b = act;
        m17276r();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17272C0() {
        return null;
    }

    public void destroy() {
        WindowManager windowManager = this.f14899c;
        if (windowManager != null) {
            TextView textView = this.f14903g;
            if (textView != null) {
                windowManager.removeView(textView);
                this.f14903g = null;
            }
            TextView textView2 = this.f14902f;
            if (textView2 != null) {
                this.f14899c.removeView(textView2);
                this.f14902f = null;
            }
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m17274i1(kjx kjxVar) {
        this.f14897a = kjxVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m17275j(String str) {
        TextView textView = this.f14903g;
        if (textView != null) {
            textView.setText(str);
            this.f14903g.setVisibility(0);
            this.f14899c.updateViewLayout(this.f14903g, this.f14901e);
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f14901e = layoutParams;
        layoutParams.type = 2;
        layoutParams.flags |= 8;
        layoutParams.width = t100.d(300.0f);
        WindowManager.LayoutParams layoutParams2 = this.f14901e;
        layoutParams2.format = -3;
        layoutParams2.height = t100.d(300.0f);
        this.f14901e.gravity = 17;
        TextView textView2 = new TextView(this.f14898b);
        this.f14903g = textView2;
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f14903g.setSingleLine(false);
        this.f14903g.setText(str);
        this.f14903g.setTextSize(2, 14.0f);
        this.f14903g.setTextColor(-1);
        this.f14903g.setGravity(3);
        this.f14903g.setBackgroundResource(i3c0.f12747c0);
        TextView textView3 = this.f14903g;
        int i = t100.l;
        textView3.setPadding(i, i, i, i);
        this.f14899c.addView(this.f14903g, this.f14901e);
        this.f14903g.setOnLongClickListener(new ViewOnLongClickListenerC0662b());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m17276r() {
        this.f14899c = this.f14898b.getWindow().getWindowManager();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f14900d = layoutParams;
        layoutParams.type = 99;
        layoutParams.flags |= 8;
        int i = t100.B;
        layoutParams.width = i;
        layoutParams.format = -3;
        layoutParams.height = i;
        layoutParams.gravity = 8388629;
        TextView textView = new TextView(this.f14898b);
        this.f14902f = textView;
        textView.setFocusable(true);
        this.f14902f.setText("D");
        this.f14902f.setTextSize(2, 20.0f);
        this.f14902f.setTextColor(-65536);
        this.f14902f.setGravity(17);
        this.f14902f.setBackgroundResource(i3c0.f12771e0);
        this.f14899c.addView(this.f14902f, this.f14900d);
        this.f14902f.setOnTouchListener(new ViewOnTouchListenerC0663c());
        xdl0.E0(this.f14902f, new ViewOnClickListenerC0661a());
    }
}
