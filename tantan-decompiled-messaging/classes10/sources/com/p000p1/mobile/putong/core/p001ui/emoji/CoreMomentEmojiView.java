package com.p000p1.mobile.putong.core.p001ui.emoji;

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
import com.p000p1.mobile.putong.core.p001ui.emoji.CoreMomentEmojiView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.e51;
import l.f6c0;
import l.fxe;
import l.kye;
import l.o7r;
import l.t100;
import l.u4c0;
import l.upa;
import l.wp1;
import l.x2c0;
import l.xdl0;
import l.yt0;
import p003l.dz9;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreMomentEmojiView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreMomentEmojiView f1525a;

    /* JADX INFO: renamed from: b */
    public GridView f1526b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1527c;

    /* JADX INFO: renamed from: d */
    public VImage f1528d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f1529e;

    /* JADX INFO: renamed from: f */
    public VText f1530f;

    /* JADX INFO: renamed from: g */
    public Act f1531g;

    /* JADX INFO: renamed from: h */
    public e30<String> f1532h;

    /* JADX INFO: renamed from: i */
    public d30 f1533i;

    /* JADX INFO: renamed from: j */
    public MessageInputEditView f1534j;

    /* JADX INFO: renamed from: k */
    public C3106c f1535k;

    /* JADX INFO: renamed from: l */
    public C3107d f1536l;

    /* JADX INFO: renamed from: m */
    public boolean f1537m;

    /* JADX INFO: renamed from: n */
    public Runnable f1538n;

    /* JADX INFO: renamed from: o */
    public int f1539o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$a */
    public class ViewOnTouchListenerC3104a implements View.OnTouchListener {
        public ViewOnTouchListenerC3104a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                CoreMomentEmojiView.this.f1537m = false;
                CoreMomentEmojiView.this.m2697p();
            } else if (motionEvent.getAction() == 1) {
                if (xdl0.O(view, motionEvent) && !CoreMomentEmojiView.this.f1537m) {
                    CoreMomentEmojiView.this.m2694m();
                }
                CoreMomentEmojiView.this.m2698q();
            } else if (motionEvent.getAction() == 3) {
                CoreMomentEmojiView.this.m2698q();
            } else if (!xdl0.O(view, motionEvent)) {
                CoreMomentEmojiView.this.m2698q();
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$b */
    public class RunnableC3105b implements Runnable {
        public RunnableC3105b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreMomentEmojiView.this.f1537m = true;
            boolean zM2694m = CoreMomentEmojiView.this.m2694m();
            if (!NullChecker.a(CoreMomentEmojiView.this.f1538n) || zM2694m) {
                return;
            }
            e51.H(CoreMomentEmojiView.this.f1531g, CoreMomentEmojiView.this.f1538n, 130L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c */
    public class C3106c extends wp1<kye.a> {

        /* JADX INFO: renamed from: c */
        public ArrayList<kye.a> f1542c;

        /* JADX INFO: renamed from: d */
        public final e30<String> f1543d;

        /* JADX INFO: renamed from: e */
        public PopupWindow f1544e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c$a */
        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.a(C3106c.this.f1544e) || !C3106c.this.f1544e.isShowing()) {
                    return false;
                }
                C3106c.this.f1544e.dismiss();
                return false;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c$b */
        public class b implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f1547a;

            public b(View view) {
                this.f1547a = view;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (NullChecker.a(this.f1547a.getParent())) {
                    this.f1547a.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        public C3106c(e30<String> e30Var, ArrayList<kye.a> arrayList) {
            this.f1542c = arrayList;
            this.f1543d = e30Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void m2702A(View view) {
            this.f1543d.call((String) view.getTag());
        }

        /* JADX INFO: renamed from: C */
        private void m2703C(PopupWindow popupWindow, View view, View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iY0 = xdl0.y0();
            int i = t100.a;
            if (measuredWidth > iY0 - i) {
                width = (xdl0.y0() - i) - contentView.getMeasuredWidth();
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
        private PopupWindow m2707y(Context context, int i, String str) {
            View viewInflate = o7r.a(context).inflate(f6c0.v7, (ViewGroup) null);
            VImage vImageFindViewById = viewInflate.findViewById(u4c0.g6);
            VText vTextFindViewById = viewInflate.findViewById(u4c0.Pd);
            VText vTextFindViewById2 = viewInflate.findViewById(u4c0.t3);
            CoreMomentEmojiView.this.m2701t(viewInflate, null, vTextFindViewById);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            yt0.b(str);
            if (yt0.b(str)) {
                xdl0.M(vTextFindViewById2, true);
                xdl0.M(vImageFindViewById, false);
                vTextFindViewById2.setText("[" + str + "]");
            } else {
                vImageFindViewById.setImageResource(i);
            }
            vTextFindViewById.setText(str);
            return popupWindow;
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ boolean m2708B(View view, kye.a aVar, String str, View view2) {
            PopupWindow popupWindowM2707y = m2707y(view.getContext(), aVar.d, str);
            this.f1544e = popupWindowM2707y;
            m2703C(popupWindowM2707y, view, view2);
            return true;
        }

        public int getCount() {
            return this.f1542c.size();
        }

        public Object getItem(int i) {
            return this.f1542c.get(i);
        }

        public long getItemId(int i) {
            return i;
        }

        /* JADX INFO: renamed from: m */
        public View m2710m(ViewGroup viewGroup, int i) {
            return o7r.a(viewGroup.getContext()).inflate(f6c0.u7, (ViewGroup) null);
        }

        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void m2709j(final View view, final kye.a aVar, int i, int i2) {
            Object obj;
            final String string;
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-2, -2);
                layoutParams.width = CoreMomentEmojiView.this.f1539o;
                layoutParams.height = CoreMomentEmojiView.this.f1539o;
            }
            view.setLayoutParams(layoutParams);
            ImageView imageView = (ImageView) view.findViewById(u4c0.u6);
            int i3 = aVar.d;
            if (i3 <= 0) {
                imageView.setImageDrawable(new fxe(imageView.getContext(), aVar.a, 24.0f, t100.d(24.0f)));
                view.setOnClickListener(new View.OnClickListener() { // from class: l.az9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f2904a.m2712z(aVar, view2);
                    }
                });
                return;
            }
            imageView.setImageResource(i3);
            if (TextUtils.isEmpty(aVar.a)) {
                obj = "[" + CoreModule.b.getString(aVar.b) + "]";
                string = CoreModule.b.getString(aVar.b);
            } else {
                obj = "[" + aVar.a + "]";
                string = aVar.a;
            }
            view.setTag(obj);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.bz9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f3491a.m2702A(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cz9
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f4093a.m2708B(view, aVar, string, view2);
                }
            });
            view.setOnTouchListener(new a());
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m2712z(kye.a aVar, View view) {
            this.f1543d.call(aVar.a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$d */
    public static class C3107d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public View f1549a;

        /* JADX INFO: renamed from: b */
        public View f1550b;

        public C3107d(View view, View view2) {
            this.f1549a = view;
            this.f1550b = view2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.a(this.f1549a)) {
                String string = editable == null ? null : editable.toString();
                boolean z = false;
                this.f1549a.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
                View view = this.f1550b;
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
        this.f1537m = false;
        this.f1538n = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2682a(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m2693l(View view) {
        dz9.m6223a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2694m() {
        if (TextUtils.isEmpty(this.f1534j.getText())) {
            return true;
        }
        this.f1534j.dispatchKeyEvent(new KeyEvent(0, 67));
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m2695n(View view, View view2) {
        if (xdl0.O0(view2)) {
            xdl0.W(view, -t100.d(10.0f));
        } else {
            xdl0.W(view, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2696o(View view) {
        if (NullChecker.a(this.f1533i)) {
            this.f1533i.call();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f1536l) && NullChecker.a(this.f1534j)) {
            this.f1534j.removeTextChangedListener(this.f1536l);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2693l(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2697p() {
        if (this.f1538n == null) {
            this.f1538n = new RunnableC3105b();
        }
        e51.H(this.f1531g, this.f1538n, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: q */
    public final void m2698q() {
        if (NullChecker.a(this.f1538n)) {
            e51.J(this.f1538n);
            this.f1538n = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2699r(View view, View view2, View view3) {
        m2695n(view, view3);
        if (!xdl0.O0(view2)) {
            xdl0.W(view, t100.d(10.0f));
        }
        xdl0.E0(view3, new View.OnClickListener() { // from class: l.yy9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f9150a.m2696o(view4);
            }
        });
        String string = this.f1534j.getEditableText() == null ? null : this.f1534j.getEditableText().toString();
        boolean z = false;
        view.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
        if (string != null && !string.trim().isEmpty()) {
            z = true;
        }
        view3.setEnabled(z);
        C3107d c3107d = new C3107d(view, view3);
        this.f1536l = c3107d;
        this.f1534j.addTextChangedListener(c3107d);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.zy9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CoreMomentEmojiView.m2682a(view4);
            }
        });
        view.setOnTouchListener(new ViewOnTouchListenerC3104a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.widget.ListAdapter, com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c] */
    /* JADX INFO: renamed from: s */
    public void m2700s(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView) {
        this.f1531g = act;
        this.f1532h = e30Var;
        this.f1533i = d30Var;
        this.f1534j = messageInputEditView;
        GridView gridView = this.f1526b;
        if (gridView == null) {
            return;
        }
        gridView.setOverScrollMode(2);
        this.f1526b.setNumColumns(7);
        ?? c3106c = new C3106c(e30Var, kye.d);
        this.f1535k = c3106c;
        this.f1526b.setAdapter((ListAdapter) c3106c);
        this.f1539o = xdl0.y0() / 7;
        this.f1530f.setBackgroundResource(upa.z() ? x2c0.we : x2c0.ve);
        this.f1528d.setImageResource(upa.z() ? x2c0.De : x2c0.Ce);
        m2699r(this.f1528d, this.f1529e, this.f1530f);
    }

    /* JADX INFO: renamed from: t */
    public final void m2701t(View view, TextView textView, TextView textView2) {
        view.setBackgroundResource(x2c0.Ge);
        if (NullChecker.a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    public CoreMomentEmojiView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1537m = false;
        this.f1538n = null;
    }

    public CoreMomentEmojiView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1537m = false;
        this.f1538n = null;
    }
}
