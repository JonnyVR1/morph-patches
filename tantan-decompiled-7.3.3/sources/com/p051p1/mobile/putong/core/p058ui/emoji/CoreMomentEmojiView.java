package com.p051p1.mobile.putong.core.p058ui.emoji;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiView;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.dq1;
import p153l.eu0;
import p153l.gra;
import p153l.jye;
import p153l.kec0;
import p153l.l51;
import p153l.o0a;
import p153l.oze;
import p153l.p9r;
import p153l.qa00;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMomentEmojiView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreMomentEmojiView f29979a;

    /* JADX INFO: renamed from: b */
    public GridView f29980b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f29981c;

    /* JADX INFO: renamed from: d */
    public VImage f29982d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f29983e;

    /* JADX INFO: renamed from: f */
    public VText f29984f;

    /* JADX INFO: renamed from: g */
    public Act f29985g;

    /* JADX INFO: renamed from: h */
    public y20<String> f29986h;

    /* JADX INFO: renamed from: i */
    public x20 f29987i;

    /* JADX INFO: renamed from: j */
    public MessageInputEditView f29988j;

    /* JADX INFO: renamed from: k */
    public C8494c f29989k;

    /* JADX INFO: renamed from: l */
    public C8495d f29990l;

    /* JADX INFO: renamed from: m */
    public boolean f29991m;

    /* JADX INFO: renamed from: n */
    public Runnable f29992n;

    /* JADX INFO: renamed from: o */
    public int f29993o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$a */
    public class ViewOnTouchListenerC8492a implements View.OnTouchListener {
        public ViewOnTouchListenerC8492a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                CoreMomentEmojiView.this.f29991m = false;
                CoreMomentEmojiView.this.m46555p();
            } else if (motionEvent.getAction() == 1) {
                if (bnl0.m105528O(view, motionEvent) && !CoreMomentEmojiView.this.f29991m) {
                    CoreMomentEmojiView.this.m46552m();
                }
                CoreMomentEmojiView.this.m46556q();
            } else if (motionEvent.getAction() == 3) {
                CoreMomentEmojiView.this.m46556q();
            } else if (!bnl0.m105528O(view, motionEvent)) {
                CoreMomentEmojiView.this.m46556q();
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$b */
    public class RunnableC8493b implements Runnable {
        public RunnableC8493b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CoreMomentEmojiView.this.f29991m = true;
            boolean zM46552m = CoreMomentEmojiView.this.m46552m();
            if (!NullChecker.m82486a(CoreMomentEmojiView.this.f29992n) || zM46552m) {
                return;
            }
            l51.m152888H(CoreMomentEmojiView.this.f29985g, CoreMomentEmojiView.this.f29992n, 130L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c */
    public class C8494c extends dq1<oze.C19253a> {

        /* JADX INFO: renamed from: c */
        public ArrayList<oze.C19253a> f29996c;

        /* JADX INFO: renamed from: d */
        public final y20<String> f29997d;

        /* JADX INFO: renamed from: e */
        public PopupWindow f29998e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c$a */
        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1 || !NullChecker.m82486a(C8494c.this.f29998e) || !C8494c.this.f29998e.isShowing()) {
                    return false;
                }
                C8494c.this.f29998e.dismiss();
                return false;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$c$b */
        public class b implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f30001a;

            public b(View view) {
                this.f30001a = view;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (NullChecker.m82486a(this.f30001a.getParent())) {
                    this.f30001a.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        public C8494c(y20<String> y20Var, ArrayList<oze.C19253a> arrayList) {
            this.f29996c = arrayList;
            this.f29997d = y20Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void m46560A(View view) {
            this.f29997d.call((String) view.getTag());
        }

        /* JADX INFO: renamed from: C */
        private void m46561C(PopupWindow popupWindow, View view, View view2) {
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            View contentView = popupWindow.getContentView();
            contentView.measure(0, 0);
            int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
            int measuredHeight = iArr[1] - contentView.getMeasuredHeight();
            int measuredWidth = contentView.getMeasuredWidth() + width;
            int iM105592y0 = bnl0.m105592y0();
            int i = qa00.f156314a;
            if (measuredWidth > iM105592y0 - i) {
                width = (bnl0.m105592y0() - i) - contentView.getMeasuredWidth();
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
        private PopupWindow m46565y(Context context, int i, String str) {
            View viewInflate = p9r.m171370a(context).inflate(kec0.f125357C7, (ViewGroup) null);
            VImage vImage = (VImage) viewInflate.findViewById(adc0.f70385i6);
            VText vText = (VText) viewInflate.findViewById(adc0.f70124Sd);
            VText vText2 = (VText) viewInflate.findViewById(adc0.f70602v3);
            CoreMomentEmojiView.this.m46559t(viewInflate, null, vText);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            eu0.m122519b(str);
            if (eu0.m122519b(str)) {
                bnl0.m105524M(vText2, true);
                bnl0.m105524M(vImage, false);
                vText2.setText("[" + str + Constants.AES_SUFFIX);
            } else {
                vImage.setImageResource(i);
            }
            vText.setText(str);
            return popupWindow;
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ boolean m46566B(View view, oze.C19253a c19253a, String str, View view2) {
            PopupWindow popupWindowM46565y = m46565y(view.getContext(), c19253a.f149876d, str);
            this.f29998e = popupWindowM46565y;
            m46561C(popupWindowM46565y, view, view2);
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f29996c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f29996c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return p9r.m171370a(viewGroup.getContext()).inflate(kec0.f125340B7, (ViewGroup) null);
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void mo21401j(final View view, final oze.C19253a c19253a, int i, int i2) {
            Object obj;
            final String string;
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new AbsListView.LayoutParams(-2, -2);
                layoutParams.width = CoreMomentEmojiView.this.f29993o;
                layoutParams.height = CoreMomentEmojiView.this.f29993o;
            }
            view.setLayoutParams(layoutParams);
            ImageView imageView = (ImageView) view.findViewById(adc0.f70622w6);
            int i3 = c19253a.f149876d;
            if (i3 <= 0) {
                imageView.setImageDrawable(new jye(imageView.getContext(), c19253a.f149873a, 24.0f, qa00.m175859d(24.0f)));
                view.setOnClickListener(new View.OnClickListener() { // from class: l.l0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f129549a.m46568z(c19253a, view2);
                    }
                });
                return;
            }
            imageView.setImageResource(i3);
            if (TextUtils.isEmpty(c19253a.f149873a)) {
                obj = "[" + CoreModule.f18263b.getString(c19253a.f149874b) + Constants.AES_SUFFIX;
                string = CoreModule.f18263b.getString(c19253a.f149874b);
            } else {
                obj = "[" + c19253a.f149873a + Constants.AES_SUFFIX;
                string = c19253a.f149873a;
            }
            view.setTag(obj);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.m0a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f134302a.m46560A(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.n0a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f139598a.m46566B(view, c19253a, string, view2);
                }
            });
            view.setOnTouchListener(new a());
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m46568z(oze.C19253a c19253a, View view) {
            this.f29997d.call(c19253a.f149873a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiView$d */
    public static class C8495d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public View f30003a;

        /* JADX INFO: renamed from: b */
        public View f30004b;

        public C8495d(View view, View view2) {
            this.f30003a = view;
            this.f30004b = view2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.m82486a(this.f30003a)) {
                String string = editable == null ? null : editable.toString();
                boolean z = false;
                this.f30003a.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
                View view = this.f30004b;
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
        this.f29991m = false;
        this.f29992n = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46540a(View view) {
    }

    /* JADX INFO: renamed from: l */
    public final void m46551l(View view) {
        o0a.m165424a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m46552m() {
        if (TextUtils.isEmpty(this.f29988j.getText())) {
            return true;
        }
        this.f29988j.dispatchKeyEvent(new KeyEvent(0, 67));
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m46553n(View view, View view2) {
        if (bnl0.m105529O0(view2)) {
            bnl0.m105539W(view, -qa00.m175859d(10.0f));
        } else {
            bnl0.m105539W(view, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m46554o(View view) {
        if (NullChecker.m82486a(this.f29987i)) {
            this.f29987i.call();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f29990l) && NullChecker.m82486a(this.f29988j)) {
            this.f29988j.removeTextChangedListener(this.f29990l);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46551l(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m46555p() {
        if (this.f29992n == null) {
            this.f29992n = new RunnableC8493b();
        }
        l51.m152888H(this.f29985g, this.f29992n, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: q */
    public final void m46556q() {
        if (NullChecker.m82486a(this.f29992n)) {
            l51.m152890J(this.f29992n);
            this.f29992n = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m46557r(View view, View view2, View view3) {
        m46553n(view, view3);
        if (!bnl0.m105529O0(view2)) {
            bnl0.m105539W(view, qa00.m175859d(10.0f));
        }
        bnl0.m105509E0(view3, new View.OnClickListener() { // from class: l.j0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f117801a.m46554o(view4);
            }
        });
        String string = this.f29988j.getEditableText() == null ? null : this.f29988j.getEditableText().toString();
        boolean z = false;
        view.setEnabled((string == null || string.trim().isEmpty()) ? false : true);
        if (string != null && !string.trim().isEmpty()) {
            z = true;
        }
        view3.setEnabled(z);
        C8495d c8495d = new C8495d(view, view3);
        this.f29990l = c8495d;
        this.f29988j.addTextChangedListener(c8495d);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.k0a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CoreMomentEmojiView.m46540a(view4);
            }
        });
        view.setOnTouchListener(new ViewOnTouchListenerC8492a());
    }

    /* JADX INFO: renamed from: s */
    public void m46558s(Act act, y20<String> y20Var, x20 x20Var, MessageInputEditView messageInputEditView) {
        this.f29985g = act;
        this.f29986h = y20Var;
        this.f29987i = x20Var;
        this.f29988j = messageInputEditView;
        GridView gridView = this.f29980b;
        if (gridView == null) {
            return;
        }
        gridView.setOverScrollMode(2);
        this.f29980b.setNumColumns(7);
        C8494c c8494c = new C8494c(y20Var, oze.f149866d);
        this.f29989k = c8494c;
        this.f29980b.setAdapter((ListAdapter) c8494c);
        this.f29993o = bnl0.m105592y0() / 7;
        this.f29984f.setBackgroundResource(gra.m131778z() ? dbc0.f87184lf : dbc0.f87151kf);
        this.f29982d.setImageResource(gra.m131778z() ? dbc0.f87415sf : dbc0.f87382rf);
        m46557r(this.f29982d, this.f29983e, this.f29984f);
    }

    /* JADX INFO: renamed from: t */
    public final void m46559t(View view, TextView textView, TextView textView2) {
        view.setBackgroundResource(dbc0.f87513vf);
        if (NullChecker.m82486a(textView)) {
            textView.setTextColor(Color.parseColor("#212121"));
        }
        if (NullChecker.m82486a(textView2)) {
            textView2.setTextColor(Color.parseColor("#212121"));
        }
    }

    public CoreMomentEmojiView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29991m = false;
        this.f29992n = null;
    }

    public CoreMomentEmojiView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29991m = false;
        this.f29992n = null;
    }
}
