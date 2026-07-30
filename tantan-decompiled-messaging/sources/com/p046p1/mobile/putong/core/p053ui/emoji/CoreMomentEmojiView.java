package com.p046p1.mobile.putong.core.p053ui.emoji;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiView;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VText;
import p149l.d30;
import p149l.dz9;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.fxe;
import p149l.kye;
import p149l.o7r;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.wp1;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yt0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreMomentEmojiView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreMomentEmojiView f29131a;

    /* JADX INFO: renamed from: b */
    public GridView f29132b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f29133c;

    /* JADX INFO: renamed from: d */
    public VImage f29134d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f29135e;

    /* JADX INFO: renamed from: f */
    public VText f29136f;

    /* JADX INFO: renamed from: g */
    public Act f29137g;

    /* JADX INFO: renamed from: h */
    public e30<String> f29138h;

    /* JADX INFO: renamed from: i */
    public d30 f29139i;

    /* JADX INFO: renamed from: j */
    public MessageInputEditView f29140j;

    /* JADX INFO: renamed from: k */
    public C8331c f29141k;

    /* JADX INFO: renamed from: l */
    public C8332d f29142l;

    /* JADX INFO: renamed from: m */
    public boolean f29143m;

    /* JADX INFO: renamed from: n */
    public Runnable f29144n;

    /* JADX INFO: renamed from: o */
    public int f29145o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$a */
    public class ViewOnTouchListenerC8329a implements View.OnTouchListener {
        public ViewOnTouchListenerC8329a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                CoreMomentEmojiView.this.f29143m = false;
                CoreMomentEmojiView.this.m45372p();
            } else if (motionEvent.getAction() == 1) {
                if (xdl0.m208348O(view, motionEvent) && !CoreMomentEmojiView.this.f29143m) {
                    CoreMomentEmojiView.this.m45369m();
                }
                CoreMomentEmojiView.this.m45373q();
            } else if (motionEvent.getAction() == 3) {
                CoreMomentEmojiView.this.m45373q();
            } else if (!xdl0.m208348O(view, motionEvent)) {
                CoreMomentEmojiView.this.m45373q();
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$b */
    public class RunnableC8330b implements Runnable {
        public RunnableC8330b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreMomentEmojiView.this.f29143m = true;
            boolean zM45369m = CoreMomentEmojiView.this.m45369m();
            if (!NullChecker.m81303a(CoreMomentEmojiView.this.f29144n) || zM45369m) {
                return;
            }
            e51.m114743H(CoreMomentEmojiView.this.f29137g, CoreMomentEmojiView.this.f29144n, 130L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c */
    public class C8331c extends wp1<kye.C18115a> {

        /* JADX INFO: renamed from: c */
        public ArrayList<kye.C18115a> f29148c;

        /* JADX INFO: renamed from: d */
        public final e30<String> f29149d;

        /* JADX INFO: renamed from: e */
        public PopupWindow f29150e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c$a */
        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.m81303a(C8331c.this.f29150e) || !C8331c.this.f29150e.isShowing()) {
                    return false;
                }
                C8331c.this.f29150e.dismiss();
                return false;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c$b */
        public class b implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f29153a;

            public b(View view) {
                this.f29153a = view;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (NullChecker.m81303a(this.f29153a.getParent())) {
                    this.f29153a.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        public C8331c(e30<String> e30Var, ArrayList<kye.C18115a> arrayList) {
            this.f29148c = arrayList;
            this.f29149d = e30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void m45377A(View view) {
            this.f29149d.call((String) view.getTag());
        }

        /* JADX INFO: renamed from: C */
        private void m45378C(PopupWindow popupWindow, View view, View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM208412y0 = xdl0.m208412y0();
            int i = t100.f167252a;
            if (measuredWidth > iM208412y0 - i) {
                width = (xdl0.m208412y0() - i) - contentView.getMeasuredWidth();
            } else if (width < i) {
                width = i;
            }
            popupWindow.showAtLocation(view, 51, width, measuredHeight);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.update();
            view2.getParent().requestDisallowInterceptTouchEvent(true);
            popupWindow.setOnDismissListener(new b(view2));
        }

        /* JADX INFO: renamed from: y */
        private PopupWindow m45382y(Context context, int i, String str) {
            View viewInflate = o7r.m163037a(context).inflate(f6c0.f96046v7, (ViewGroup) null);
            VImage vImage = (VImage) viewInflate.findViewById(u4c0.f174260g6);
            VText vText = (VText) viewInflate.findViewById(u4c0.f173985Pd);
            VText vText2 = (VText) viewInflate.findViewById(u4c0.f174477t3);
            CoreMomentEmojiView.this.m45376t(viewInflate, null, vText);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            yt0.m215993b(str);
            if (yt0.m215993b(str)) {
                xdl0.m208344M(vText2, true);
                xdl0.m208344M(vImage, false);
                vText2.setText("[" + str + Constants.AES_SUFFIX);
            } else {
                vImage.setImageResource(i);
            }
            vText.setText(str);
            return popupWindow;
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ boolean m45383B(View view, kye.C18115a c18115a, String str, View view2) {
            PopupWindow popupWindowM45382y = m45382y(view.getContext(), c18115a.f125289d, str);
            this.f29150e = popupWindowM45382y;
            m45378C(popupWindowM45382y, view, view2);
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f29148c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f29148c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return o7r.m163037a(viewGroup.getContext()).inflate(f6c0.f96029u7, (ViewGroup) null);
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo20402j(final View view, final kye.C18115a c18115a, int i, int i2) {
            Object obj;
            final String string;
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-2, -2);
                layoutParams.width = CoreMomentEmojiView.this.f29145o;
                layoutParams.height = CoreMomentEmojiView.this.f29145o;
            }
            view.setLayoutParams(layoutParams);
            ImageView imageView = (ImageView) view.findViewById(u4c0.f174497u6);
            int i3 = c18115a.f125289d;
            if (i3 <= 0) {
                imageView.setImageDrawable(new fxe(imageView.getContext(), c18115a.f125286a, 24.0f, t100.m186890d(24.0f)));
                view.setOnClickListener(new View.OnClickListener() { // from class: l.az9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f72342a.m45385z(c18115a, view2);
                    }
                });
                return;
            }
            imageView.setImageResource(i3);
            if (TextUtils.isEmpty(c18115a.f125286a)) {
                obj = "[" + CoreModule.f17544b.getString(c18115a.f125287b) + Constants.AES_SUFFIX;
                string = CoreModule.f17544b.getString(c18115a.f125287b);
            } else {
                obj = "[" + c18115a.f125286a + Constants.AES_SUFFIX;
                string = c18115a.f125286a;
            }
            view.setTag(obj);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.bz9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f78010a.m45377A(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cz9
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f83071a.m45383B(view, c18115a, string, view2);
                }
            });
            view.setOnTouchListener(new a());
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m45385z(kye.C18115a c18115a, View view) {
            this.f29149d.call(c18115a.f125286a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$d */
    public static class C8332d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public View f29155a;

        /* JADX INFO: renamed from: b */
        public View f29156b;

        public C8332d(View view, View view2) {
            this.f29155a = view;
            this.f29156b = view2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.m81303a(this.f29155a)) {
                String string = editable == null ? null : editable.toString();
                boolean z = false;
                this.f29155a.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
                View view = this.f29156b;
                if (string != null && !string.trim().isEmpty()) {
                    z = true;
                }
                view.setEnabled(z);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public CoreMomentEmojiView(@NonNull Context context) {
        super(context);
        this.f29143m = false;
        this.f29144n = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45357a(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m45368l(View view) {
        dz9.m114112a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m45369m() {
        if (TextUtils.isEmpty(this.f29140j.getText())) {
            return true;
        }
        this.f29140j.dispatchKeyEvent(new KeyEvent(0, 67));
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m45370n(View view, View view2) {
        if (xdl0.m208349O0(view2)) {
            xdl0.m208359W(view, -t100.m186890d(10.0f));
        } else {
            xdl0.m208359W(view, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m45371o(View view) {
        if (NullChecker.m81303a(this.f29139i)) {
            this.f29139i.call();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f29142l) && NullChecker.m81303a(this.f29140j)) {
            this.f29140j.removeTextChangedListener(this.f29142l);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45368l(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m45372p() {
        if (this.f29144n == null) {
            this.f29144n = new RunnableC8330b();
        }
        e51.m114743H(this.f29137g, this.f29144n, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: q */
    public final void m45373q() {
        if (NullChecker.m81303a(this.f29144n)) {
            e51.m114745J(this.f29144n);
            this.f29144n = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m45374r(View view, View view2, View view3) {
        m45370n(view, view3);
        if (!xdl0.m208349O0(view2)) {
            xdl0.m208359W(view, t100.m186890d(10.0f));
        }
        xdl0.m208329E0(view3, new View.OnClickListener() { // from class: l.yy9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f200717a.m45371o(view4);
            }
        });
        String string = this.f29140j.getEditableText() == null ? null : this.f29140j.getEditableText().toString();
        boolean z = false;
        view.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
        if (string != null && !string.trim().isEmpty()) {
            z = true;
        }
        view3.setEnabled(z);
        C8332d c8332d = new C8332d(view, view3);
        this.f29142l = c8332d;
        this.f29140j.addTextChangedListener(c8332d);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.zy9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CoreMomentEmojiView.m45357a(view4);
            }
        });
        view.setOnTouchListener(new ViewOnTouchListenerC8329a());
    }

    /* JADX INFO: renamed from: s */
    public void m45375s(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView) {
        this.f29137g = act;
        this.f29138h = e30Var;
        this.f29139i = d30Var;
        this.f29140j = messageInputEditView;
        GridView gridView = this.f29132b;
        if (gridView == null) {
            return;
        }
        gridView.setOverScrollMode(2);
        this.f29132b.setNumColumns(7);
        C8331c c8331c = new C8331c(e30Var, kye.f125279d);
        this.f29141k = c8331c;
        this.f29132b.setAdapter((ListAdapter) c8331c);
        this.f29145o = xdl0.m208412y0() / 7;
        this.f29136f.setBackgroundResource(upa.m194847z() ? x2c0.f190681we : x2c0.f190649ve);
        this.f29134d.setImageResource(upa.m194847z() ? x2c0.f189264De : x2c0.f189232Ce);
        m45374r(this.f29134d, this.f29135e, this.f29136f);
    }

    /* JADX INFO: renamed from: t */
    public final void m45376t(View view, TextView textView, TextView textView2) {
        view.setBackgroundResource(x2c0.f189360Ge);
        if (NullChecker.m81303a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m81303a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    public CoreMomentEmojiView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29143m = false;
        this.f29144n = null;
    }

    public CoreMomentEmojiView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29143m = false;
        this.f29144n = null;
    }
}
