package p149l;

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
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes4.dex */
public class ljx implements s7m<kjx> {

    /* JADX INFO: renamed from: a */
    public kjx f128412a;

    /* JADX INFO: renamed from: b */
    public Act f128413b;

    /* JADX INFO: renamed from: c */
    public WindowManager f128414c;

    /* JADX INFO: renamed from: d */
    public WindowManager.LayoutParams f128415d;

    /* JADX INFO: renamed from: e */
    public WindowManager.LayoutParams f128416e;

    /* JADX INFO: renamed from: f */
    public TextView f128417f;

    /* JADX INFO: renamed from: g */
    public TextView f128418g;

    /* JADX INFO: renamed from: l.ljx$a */
    public class ViewOnClickListenerC18234a implements View.OnClickListener {
        public ViewOnClickListenerC18234a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ljx.this.f128418g == null || ljx.this.f128418g.getVisibility() != 0) {
                ljx.this.f128412a.m146289R3();
            } else {
                ljx.this.f128418g.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: l.ljx$b */
    public class ViewOnLongClickListenerC18235b implements View.OnLongClickListener {
        public ViewOnLongClickListenerC18235b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            m95.m153590c(ljx.this.f128413b).m153591a("anchorMediaData", ljx.this.f128418g.getText().toString());
            lsi0.m151595y("已复制到剪切板");
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ljx$c */
    public class ViewOnTouchListenerC18236c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public int f128421a;

        /* JADX INFO: renamed from: b */
        public int f128422b;

        /* JADX INFO: renamed from: c */
        public int f128423c;

        public ViewOnTouchListenerC18236c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (ljx.this.f128417f == null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.f128421a = (int) motionEvent.getRawY();
                this.f128423c = 0;
            } else if (motionEvent.getAction() == 2) {
                int rawY = (int) motionEvent.getRawY();
                this.f128422b = rawY;
                this.f128423c = rawY - this.f128421a;
                this.f128421a = rawY;
                ljx.this.f128415d.y += this.f128423c;
                ljx.this.f128414c.updateViewLayout(ljx.this.f128417f, ljx.this.f128415d);
            } else if (motionEvent.getAction() == 1) {
                ljx.this.f128414c.updateViewLayout(ljx.this.f128417f, ljx.this.f128415d);
            }
            return false;
        }
    }

    public ljx(Act act) {
        this.f128413b = act;
        m150053r();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        WindowManager windowManager = this.f128414c;
        if (windowManager != null) {
            TextView textView = this.f128418g;
            if (textView != null) {
                windowManager.removeView(textView);
                this.f128418g = null;
            }
            TextView textView2 = this.f128417f;
            if (textView2 != null) {
                this.f128414c.removeView(textView2);
                this.f128417f = null;
            }
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kjx kjxVar) {
        this.f128412a = kjxVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m150052j(String str) {
        TextView textView = this.f128418g;
        if (textView != null) {
            textView.setText(str);
            this.f128418g.setVisibility(0);
            this.f128414c.updateViewLayout(this.f128418g, this.f128416e);
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f128416e = layoutParams;
        layoutParams.type = 2;
        layoutParams.flags |= 8;
        layoutParams.width = t100.m186890d(300.0f);
        WindowManager.LayoutParams layoutParams2 = this.f128416e;
        layoutParams2.format = -3;
        layoutParams2.height = t100.m186890d(300.0f);
        this.f128416e.gravity = 17;
        TextView textView2 = new TextView(this.f128413b);
        this.f128418g = textView2;
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f128418g.setSingleLine(false);
        this.f128418g.setText(str);
        this.f128418g.setTextSize(2, 14.0f);
        this.f128418g.setTextColor(-1);
        this.f128418g.setGravity(3);
        this.f128418g.setBackgroundResource(i3c0.f110962c0);
        TextView textView3 = this.f128418g;
        int i = t100.f167263l;
        textView3.setPadding(i, i, i, i);
        this.f128414c.addView(this.f128418g, this.f128416e);
        this.f128418g.setOnLongClickListener(new ViewOnLongClickListenerC18235b());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m150053r() {
        this.f128414c = this.f128413b.getWindow().getWindowManager();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f128415d = layoutParams;
        layoutParams.type = 99;
        layoutParams.flags |= 8;
        int i = t100.f167227B;
        layoutParams.width = i;
        layoutParams.format = -3;
        layoutParams.height = i;
        layoutParams.gravity = 8388629;
        TextView textView = new TextView(this.f128413b);
        this.f128417f = textView;
        textView.setFocusable(true);
        this.f128417f.setText("D");
        this.f128417f.setTextSize(2, 20.0f);
        this.f128417f.setTextColor(-65536);
        this.f128417f.setGravity(17);
        this.f128417f.setBackgroundResource(i3c0.f110986e0);
        this.f128414c.addView(this.f128417f, this.f128415d);
        this.f128417f.setOnTouchListener(new ViewOnTouchListenerC18236c());
        xdl0.m208329E0(this.f128417f, new ViewOnClickListenerC18234a());
    }
}
