package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.DialogInterfaceC0075a;
import p153l.a8f0;
import p153l.gic0;
import p153l.jnl0;
import p153l.jvi0;
import p153l.kfc0;
import p153l.kkl0;
import p153l.ku0;
import p153l.r26;
import p153l.s8c0;
import p153l.t0j0;
import p153l.tu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f625i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final ku0 f626a;

    /* JADX INFO: renamed from: b */
    public final Context f627b;

    /* JADX INFO: renamed from: c */
    public AbstractViewOnTouchListenerC0163a f628c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f629d;

    /* JADX INFO: renamed from: e */
    public final boolean f630e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0128f f631f;

    /* JADX INFO: renamed from: g */
    public int f632g;

    /* JADX INFO: renamed from: h */
    public final Rect f633h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0123a extends AbstractViewOnTouchListenerC0163a {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0127e f634j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0123a(View view, C0127e c0127e) {
            super(view);
            this.f634j = c0127e;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0163a
        /* JADX INFO: renamed from: b */
        public a8f0 mo373b() {
            return this.f634j;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0163a
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: c */
        public boolean mo374c() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.m544b();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0124b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0124b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.m544b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    @VisibleForTesting
    public class DialogInterfaceOnClickListenerC0125c implements InterfaceC0128f, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        @VisibleForTesting
        public DialogInterfaceC0075a f637a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f638b;

        /* JADX INFO: renamed from: c */
        public CharSequence f639c;

        public DialogInterfaceOnClickListenerC0125c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: b */
        public void mo547b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: c */
        public void mo548c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: d */
        public void mo549d(int i, int i2) {
            if (this.f638b == null) {
                return;
            }
            DialogInterfaceC0075a.a aVar = new DialogInterfaceC0075a.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f639c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            DialogInterfaceC0075a dialogInterfaceC0075aCreate = aVar.setSingleChoiceItems(this.f638b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f637a = dialogInterfaceC0075aCreate;
            ListView listViewM358q = dialogInterfaceC0075aCreate.m358q();
            listViewM358q.setTextDirection(i);
            listViewM358q.setTextAlignment(i2);
            this.f637a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        public void dismiss() {
            DialogInterfaceC0075a dialogInterfaceC0075a = this.f637a;
            if (dialogInterfaceC0075a != null) {
                dialogInterfaceC0075a.dismiss();
                this.f637a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: e */
        public int mo550e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: h */
        public int mo551h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: i */
        public void mo552i(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        public boolean isShowing() {
            DialogInterfaceC0075a dialogInterfaceC0075a = this.f637a;
            if (dialogInterfaceC0075a != null) {
                return dialogInterfaceC0075a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: j */
        public CharSequence mo553j() {
            return this.f639c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: k */
        public void mo554k(CharSequence charSequence) {
            this.f639c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: l */
        public void mo555l(ListAdapter listAdapter) {
            this.f638b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f638b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static class C0126d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        public SpinnerAdapter f641a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f642b;

        public C0126d(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.f641a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f642b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof jvi0) {
                    jvi0 jvi0Var = (jvi0) spinnerAdapter;
                    if (jvi0Var.getDropDownViewTheme() == null) {
                        jvi0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f642b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f641a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f641a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f641a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f641a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f641a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f642b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f641a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f641a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    @VisibleForTesting
    public class C0127e extends C0164b implements InterfaceC0128f {

        /* JADX INFO: renamed from: J */
        public CharSequence f643J;

        /* JADX INFO: renamed from: K */
        public ListAdapter f644K;

        /* JADX INFO: renamed from: L */
        public final Rect f645L;

        /* JADX INFO: renamed from: M */
        public int f646M;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AppCompatSpinner f648a;

            public a(AppCompatSpinner appCompatSpinner) {
                this.f648a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0127e c0127e = C0127e.this;
                    AppCompatSpinner.this.performItemClick(view, i, c0127e.f644K.getItemId(i));
                }
                C0127e.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0127e c0127e = C0127e.this;
                boolean zM559M = c0127e.m559M(AppCompatSpinner.this);
                C0127e c0127e2 = C0127e.this;
                if (!zM559M) {
                    c0127e2.dismiss();
                } else {
                    c0127e2.m557K();
                    C0127e.super.show();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f651a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f651a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f651a);
                }
            }
        }

        public C0127e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f645L = new Rect();
            m639v(AppCompatSpinner.this);
            m619B(true);
            m624G(0);
            m621D(new a(AppCompatSpinner.this));
        }

        /* JADX INFO: renamed from: K */
        public void m557K() {
            int i;
            Drawable background = getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f633h);
                boolean zM146265b = jnl0.m146265b(AppCompatSpinner.this);
                AppCompatSpinner appCompatSpinner2 = AppCompatSpinner.this;
                i = zM146265b ? appCompatSpinner2.f633h.right : -appCompatSpinner2.f633h.left;
            } else {
                Rect rect = appCompatSpinner.f633h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner3 = AppCompatSpinner.this;
            int i2 = appCompatSpinner3.f632g;
            if (i2 == -2) {
                int iM543a = appCompatSpinner3.m543a((SpinnerAdapter) this.f644K, getBackground());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f633h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iM543a > i4) {
                    iM543a = i4;
                }
                m641x(Math.max(iM543a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m641x((width - paddingLeft) - paddingRight);
            } else {
                m641x(i2);
            }
            m630i(jnl0.m146265b(AppCompatSpinner.this) ? i + (((width - paddingRight) - m635r()) - m558L()) : i + paddingLeft + m558L());
        }

        /* JADX INFO: renamed from: L */
        public int m558L() {
            return this.f646M;
        }

        /* JADX INFO: renamed from: M */
        public boolean m559M(View view) {
            return kkl0.m150133O(view) && view.getGlobalVisibleRect(this.f645L);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: c */
        public void mo548c(int i) {
            this.f646M = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: d */
        public void mo549d(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            m557K();
            m618A(2);
            super.show();
            ListView listViewMo405g = mo405g();
            listViewMo405g.setChoiceMode(1);
            listViewMo405g.setTextDirection(i);
            listViewMo405g.setTextAlignment(i2);
            m625H(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m620C(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: j */
        public CharSequence mo553j() {
            return this.f643J;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: k */
        public void mo554k(CharSequence charSequence) {
            this.f643J = charSequence;
        }

        @Override // androidx.appcompat.widget.C0164b, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0128f
        /* JADX INFO: renamed from: l */
        public void mo555l(ListAdapter listAdapter) {
            super.mo555l(listAdapter);
            this.f644K = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    @VisibleForTesting
    public interface InterfaceC0128f {
        /* JADX INFO: renamed from: b */
        void mo547b(int i);

        /* JADX INFO: renamed from: c */
        void mo548c(int i);

        /* JADX INFO: renamed from: d */
        void mo549d(int i, int i2);

        void dismiss();

        /* JADX INFO: renamed from: e */
        int mo550e();

        Drawable getBackground();

        /* JADX INFO: renamed from: h */
        int mo551h();

        /* JADX INFO: renamed from: i */
        void mo552i(int i);

        boolean isShowing();

        /* JADX INFO: renamed from: j */
        CharSequence mo553j();

        /* JADX INFO: renamed from: k */
        void mo554k(CharSequence charSequence);

        /* JADX INFO: renamed from: l */
        void mo555l(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM188799q;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f633h = new Rect();
        t0j0 t0j0VarM188782u = t0j0.m188782u(context, attributeSet, gic0.f104222A2, i, 0);
        this.f626a = new ku0(this);
        if (theme != null) {
            this.f627b = new r26(context, theme);
        } else {
            int iM188796n = t0j0VarM188782u.m188796n(gic0.f104247F2, 0);
            if (iM188796n != 0) {
                this.f627b = new r26(context, iM188796n);
            } else {
                this.f627b = context;
            }
        }
        TypedArray typedArray = null;
        if (i2 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f625i, i, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                        DialogInterfaceOnClickListenerC0125c dialogInterfaceOnClickListenerC0125c = new DialogInterfaceOnClickListenerC0125c();
                        this.f631f = dialogInterfaceOnClickListenerC0125c;
                        dialogInterfaceOnClickListenerC0125c.mo554k(t0j0VarM188782u.m188797o(gic0.f104237D2));
                    } else if (i2 == 1) {
                        C0127e c0127e = new C0127e(this.f627b, attributeSet, i);
                        t0j0 t0j0VarM188782u2 = t0j0.m188782u(this.f627b, attributeSet, gic0.f104222A2, i, 0);
                        this.f632g = t0j0VarM188782u2.m188795m(gic0.f104242E2, -2);
                        c0127e.setBackgroundDrawable(t0j0VarM188782u2.m188789g(gic0.f104232C2));
                        c0127e.mo554k(t0j0VarM188782u.m188797o(gic0.f104237D2));
                        t0j0VarM188782u2.m188801v();
                        this.f631f = c0127e;
                        this.f628c = new C0123a(this, c0127e);
                    }
                    charSequenceArrM188799q = t0j0VarM188782u.m188799q(gic0.f104227B2);
                    if (charSequenceArrM188799q != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM188799q);
                        arrayAdapter.setDropDownViewResource(kfc0.f126286v);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    t0j0VarM188782u.m188801v();
                    this.f630e = true;
                    spinnerAdapter = this.f629d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f629d = null;
                    }
                    this.f626a.m151418e(attributeSet, i);
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th2) {
                th = th2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC0125c dialogInterfaceOnClickListenerC0125c2 = new DialogInterfaceOnClickListenerC0125c();
            this.f631f = dialogInterfaceOnClickListenerC0125c2;
            dialogInterfaceOnClickListenerC0125c2.mo554k(t0j0VarM188782u.m188797o(gic0.f104237D2));
        } else if (i2 == 1) {
            C0127e c0127e2 = new C0127e(this.f627b, attributeSet, i);
            t0j0 t0j0VarM188782u3 = t0j0.m188782u(this.f627b, attributeSet, gic0.f104222A2, i, 0);
            this.f632g = t0j0VarM188782u3.m188795m(gic0.f104242E2, -2);
            c0127e2.setBackgroundDrawable(t0j0VarM188782u3.m188789g(gic0.f104232C2));
            c0127e2.mo554k(t0j0VarM188782u.m188797o(gic0.f104237D2));
            t0j0VarM188782u3.m188801v();
            this.f631f = c0127e2;
            this.f628c = new C0123a(this, c0127e2);
        }
        charSequenceArrM188799q = t0j0VarM188782u.m188799q(gic0.f104227B2);
        if (charSequenceArrM188799q != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM188799q);
            arrayAdapter2.setDropDownViewResource(kfc0.f126286v);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        t0j0VarM188782u.m188801v();
        this.f630e = true;
        spinnerAdapter = this.f629d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f629d = null;
        }
        this.f626a.m151418e(attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public int m543a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f633h);
        Rect rect = this.f633h;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: b */
    public void m544b() {
        this.f631f.mo549d(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            ku0Var.m151415b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0128f interfaceC0128f = this.f631f;
        return interfaceC0128f != null ? interfaceC0128f.mo551h() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0128f interfaceC0128f = this.f631f;
        return interfaceC0128f != null ? interfaceC0128f.mo550e() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f631f != null ? this.f632g : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final InterfaceC0128f getInternalPopup() {
        return this.f631f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0128f interfaceC0128f = this.f631f;
        return interfaceC0128f != null ? interfaceC0128f.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f627b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0128f interfaceC0128f = this.f631f;
        return interfaceC0128f != null ? interfaceC0128f.mo553j() : super.getPrompt();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            return ku0Var.m151416c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            return ku0Var.m151417d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0128f interfaceC0128f = this.f631f;
        if (interfaceC0128f == null || !interfaceC0128f.isShowing()) {
            return;
        }
        this.f631f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f631f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m543a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.mShowDropdown || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0124b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0128f interfaceC0128f = this.f631f;
        savedState.mShowDropdown = interfaceC0128f != null && interfaceC0128f.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0163a abstractViewOnTouchListenerC0163a = this.f628c;
        if (abstractViewOnTouchListenerC0163a == null || !abstractViewOnTouchListenerC0163a.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0128f interfaceC0128f = this.f631f;
        if (interfaceC0128f == null) {
            return super.performClick();
        }
        if (interfaceC0128f.isShowing()) {
            return true;
        }
        m544b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f630e) {
            this.f629d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f631f != null) {
            Context context = this.f627b;
            if (context == null) {
                context = getContext();
            }
            this.f631f.mo555l(new C0126d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            ku0Var.m151419f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            ku0Var.m151420g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0128f interfaceC0128f = this.f631f;
        if (interfaceC0128f == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC0128f.mo548c(i);
            this.f631f.mo552i(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0128f interfaceC0128f = this.f631f;
        if (interfaceC0128f != null) {
            interfaceC0128f.mo547b(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f631f != null) {
            this.f632g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0128f interfaceC0128f = this.f631f;
        if (interfaceC0128f != null) {
            interfaceC0128f.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(tu0.m192702b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0128f interfaceC0128f = this.f631f;
        if (interfaceC0128f != null) {
            interfaceC0128f.mo554k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            ku0Var.m151422i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        ku0 ku0Var = this.f626a;
        if (ku0Var != null) {
            ku0Var.m151423j(mode);
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0122a();
        boolean mShowDropdown;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public static class C0122a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mShowDropdown = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.mShowDropdown ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166776M);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }
}
