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
import androidx.appcompat.app.DialogInterfaceC0074a;
import p149l.aac0;
import p149l.eu0;
import p149l.fel0;
import p149l.g7c0;
import p149l.gbl0;
import p149l.imi0;
import p149l.m16;
import p149l.n0c0;
import p149l.nu0;
import p149l.qri0;
import p149l.tze0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f625i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final eu0 f626a;

    /* JADX INFO: renamed from: b */
    public final Context f627b;

    /* JADX INFO: renamed from: c */
    public AbstractViewOnTouchListenerC0162a f628c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f629d;

    /* JADX INFO: renamed from: e */
    public final boolean f630e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0127f f631f;

    /* JADX INFO: renamed from: g */
    public int f632g;

    /* JADX INFO: renamed from: h */
    public final Rect f633h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0122a extends AbstractViewOnTouchListenerC0162a {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0126e f634j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0122a(View view, C0126e c0126e) {
            super(view);
            this.f634j = c0126e;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        /* JADX INFO: renamed from: b */
        public tze0 mo372b() {
            return this.f634j;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: c */
        public boolean mo373c() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.m543b();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0123b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0123b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.m543b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    @VisibleForTesting
    public class DialogInterfaceOnClickListenerC0124c implements InterfaceC0127f, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        @VisibleForTesting
        public DialogInterfaceC0074a f637a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f638b;

        /* JADX INFO: renamed from: c */
        public CharSequence f639c;

        public DialogInterfaceOnClickListenerC0124c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: b */
        public void mo546b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: c */
        public void mo547c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: d */
        public void mo548d(int i, int i2) {
            if (this.f638b == null) {
                return;
            }
            DialogInterfaceC0074a.a aVar = new DialogInterfaceC0074a.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f639c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            DialogInterfaceC0074a dialogInterfaceC0074aCreate = aVar.setSingleChoiceItems(this.f638b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f637a = dialogInterfaceC0074aCreate;
            ListView listViewM357q = dialogInterfaceC0074aCreate.m357q();
            listViewM357q.setTextDirection(i);
            listViewM357q.setTextAlignment(i2);
            this.f637a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        public void dismiss() {
            DialogInterfaceC0074a dialogInterfaceC0074a = this.f637a;
            if (dialogInterfaceC0074a != null) {
                dialogInterfaceC0074a.dismiss();
                this.f637a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: e */
        public int mo549e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: h */
        public int mo550h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: i */
        public void mo551i(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        public boolean isShowing() {
            DialogInterfaceC0074a dialogInterfaceC0074a = this.f637a;
            if (dialogInterfaceC0074a != null) {
                return dialogInterfaceC0074a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: j */
        public CharSequence mo552j() {
            return this.f639c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: k */
        public void mo553k(CharSequence charSequence) {
            this.f639c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: l */
        public void mo554l(ListAdapter listAdapter) {
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

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public static class C0125d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        public SpinnerAdapter f641a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f642b;

        public C0125d(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
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
                if (spinnerAdapter instanceof imi0) {
                    imi0 imi0Var = (imi0) spinnerAdapter;
                    if (imi0Var.getDropDownViewTheme() == null) {
                        imi0Var.setDropDownViewTheme(theme);
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
    public class C0126e extends C0163b implements InterfaceC0127f {

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
                    C0126e c0126e = C0126e.this;
                    AppCompatSpinner.this.performItemClick(view, i, c0126e.f644K.getItemId(i));
                }
                C0126e.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0126e c0126e = C0126e.this;
                boolean zM558M = c0126e.m558M(AppCompatSpinner.this);
                C0126e c0126e2 = C0126e.this;
                if (!zM558M) {
                    c0126e2.dismiss();
                } else {
                    c0126e2.m556K();
                    C0126e.super.show();
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

        public C0126e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f645L = new Rect();
            m638v(AppCompatSpinner.this);
            m618B(true);
            m623G(0);
            m620D(new a(AppCompatSpinner.this));
        }

        /* JADX INFO: renamed from: K */
        public void m556K() {
            int i;
            Drawable background = getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f633h);
                boolean zM121043b = fel0.m121043b(AppCompatSpinner.this);
                AppCompatSpinner appCompatSpinner2 = AppCompatSpinner.this;
                i = zM121043b ? appCompatSpinner2.f633h.right : -appCompatSpinner2.f633h.left;
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
                int iM542a = appCompatSpinner3.m542a((SpinnerAdapter) this.f644K, getBackground());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f633h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (iM542a > i4) {
                    iM542a = i4;
                }
                m640x(Math.max(iM542a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                m640x((width - paddingLeft) - paddingRight);
            } else {
                m640x(i2);
            }
            m629i(fel0.m121043b(AppCompatSpinner.this) ? i + (((width - paddingRight) - m634r()) - m557L()) : i + paddingLeft + m557L());
        }

        /* JADX INFO: renamed from: L */
        public int m557L() {
            return this.f646M;
        }

        /* JADX INFO: renamed from: M */
        public boolean m558M(View view) {
            return gbl0.m125170O(view) && view.getGlobalVisibleRect(this.f645L);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: c */
        public void mo547c(int i) {
            this.f646M = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: d */
        public void mo548d(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            m556K();
            m617A(2);
            super.show();
            ListView listViewMo404g = mo404g();
            listViewMo404g.setChoiceMode(1);
            listViewMo404g.setTextDirection(i);
            listViewMo404g.setTextAlignment(i2);
            m624H(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m619C(new c(bVar));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: j */
        public CharSequence mo552j() {
            return this.f643J;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: k */
        public void mo553k(CharSequence charSequence) {
            this.f643J = charSequence;
        }

        @Override // androidx.appcompat.widget.C0163b, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0127f
        /* JADX INFO: renamed from: l */
        public void mo554l(ListAdapter listAdapter) {
            super.mo554l(listAdapter);
            this.f644K = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    @VisibleForTesting
    public interface InterfaceC0127f {
        /* JADX INFO: renamed from: b */
        void mo546b(int i);

        /* JADX INFO: renamed from: c */
        void mo547c(int i);

        /* JADX INFO: renamed from: d */
        void mo548d(int i, int i2);

        void dismiss();

        /* JADX INFO: renamed from: e */
        int mo549e();

        Drawable getBackground();

        /* JADX INFO: renamed from: h */
        int mo550h();

        /* JADX INFO: renamed from: i */
        void mo551i(int i);

        boolean isShowing();

        /* JADX INFO: renamed from: j */
        CharSequence mo552j();

        /* JADX INFO: renamed from: k */
        void mo553k(CharSequence charSequence);

        /* JADX INFO: renamed from: l */
        void mo554l(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM176010q;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.f633h = new Rect();
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, aac0.f68296A2, i, 0);
        this.f626a = new eu0(this);
        if (theme != null) {
            this.f627b = new m16(context, theme);
        } else {
            int iM176007n = qri0VarM175993u.m176007n(aac0.f68321F2, 0);
            if (iM176007n != 0) {
                this.f627b = new m16(context, iM176007n);
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
                        DialogInterfaceOnClickListenerC0124c dialogInterfaceOnClickListenerC0124c = new DialogInterfaceOnClickListenerC0124c();
                        this.f631f = dialogInterfaceOnClickListenerC0124c;
                        dialogInterfaceOnClickListenerC0124c.mo553k(qri0VarM175993u.m176008o(aac0.f68311D2));
                    } else if (i2 == 1) {
                        C0126e c0126e = new C0126e(this.f627b, attributeSet, i);
                        qri0 qri0VarM175993u2 = qri0.m175993u(this.f627b, attributeSet, aac0.f68296A2, i, 0);
                        this.f632g = qri0VarM175993u2.m176006m(aac0.f68316E2, -2);
                        c0126e.setBackgroundDrawable(qri0VarM175993u2.m176000g(aac0.f68306C2));
                        c0126e.mo553k(qri0VarM175993u.m176008o(aac0.f68311D2));
                        qri0VarM175993u2.m176012v();
                        this.f631f = c0126e;
                        this.f628c = new C0122a(this, c0126e);
                    }
                    charSequenceArrM176010q = qri0VarM175993u.m176010q(aac0.f68301B2);
                    if (charSequenceArrM176010q != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM176010q);
                        arrayAdapter.setDropDownViewResource(g7c0.f101374v);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    qri0VarM175993u.m176012v();
                    this.f630e = true;
                    spinnerAdapter = this.f629d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f629d = null;
                    }
                    this.f626a.m118136e(attributeSet, i);
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
            DialogInterfaceOnClickListenerC0124c dialogInterfaceOnClickListenerC0124c2 = new DialogInterfaceOnClickListenerC0124c();
            this.f631f = dialogInterfaceOnClickListenerC0124c2;
            dialogInterfaceOnClickListenerC0124c2.mo553k(qri0VarM175993u.m176008o(aac0.f68311D2));
        } else if (i2 == 1) {
            C0126e c0126e2 = new C0126e(this.f627b, attributeSet, i);
            qri0 qri0VarM175993u3 = qri0.m175993u(this.f627b, attributeSet, aac0.f68296A2, i, 0);
            this.f632g = qri0VarM175993u3.m176006m(aac0.f68316E2, -2);
            c0126e2.setBackgroundDrawable(qri0VarM175993u3.m176000g(aac0.f68306C2));
            c0126e2.mo553k(qri0VarM175993u.m176008o(aac0.f68311D2));
            qri0VarM175993u3.m176012v();
            this.f631f = c0126e2;
            this.f628c = new C0122a(this, c0126e2);
        }
        charSequenceArrM176010q = qri0VarM175993u.m176010q(aac0.f68301B2);
        if (charSequenceArrM176010q != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM176010q);
            arrayAdapter2.setDropDownViewResource(g7c0.f101374v);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        qri0VarM175993u.m176012v();
        this.f630e = true;
        spinnerAdapter = this.f629d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f629d = null;
        }
        this.f626a.m118136e(attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    public int m542a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
    public void m543b() {
        this.f631f.mo548d(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            eu0Var.m118133b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0127f interfaceC0127f = this.f631f;
        return interfaceC0127f != null ? interfaceC0127f.mo550h() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0127f interfaceC0127f = this.f631f;
        return interfaceC0127f != null ? interfaceC0127f.mo549e() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f631f != null ? this.f632g : super.getDropDownWidth();
    }

    @VisibleForTesting
    public final InterfaceC0127f getInternalPopup() {
        return this.f631f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0127f interfaceC0127f = this.f631f;
        return interfaceC0127f != null ? interfaceC0127f.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f627b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0127f interfaceC0127f = this.f631f;
        return interfaceC0127f != null ? interfaceC0127f.mo552j() : super.getPrompt();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            return eu0Var.m118134c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            return eu0Var.m118135d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0127f interfaceC0127f = this.f631f;
        if (interfaceC0127f == null || !interfaceC0127f.isShowing()) {
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
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m542a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.mShowDropdown || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0123b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0127f interfaceC0127f = this.f631f;
        savedState.mShowDropdown = interfaceC0127f != null && interfaceC0127f.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0162a abstractViewOnTouchListenerC0162a = this.f628c;
        if (abstractViewOnTouchListenerC0162a == null || !abstractViewOnTouchListenerC0162a.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0127f interfaceC0127f = this.f631f;
        if (interfaceC0127f == null) {
            return super.performClick();
        }
        if (interfaceC0127f.isShowing()) {
            return true;
        }
        m543b();
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
            this.f631f.mo554l(new C0125d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            eu0Var.m118137f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            eu0Var.m118138g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0127f interfaceC0127f = this.f631f;
        if (interfaceC0127f == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC0127f.mo547c(i);
            this.f631f.mo551i(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0127f interfaceC0127f = this.f631f;
        if (interfaceC0127f != null) {
            interfaceC0127f.mo546b(i);
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
        InterfaceC0127f interfaceC0127f = this.f631f;
        if (interfaceC0127f != null) {
            interfaceC0127f.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(nu0.m161424b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0127f interfaceC0127f = this.f631f;
        if (interfaceC0127f != null) {
            interfaceC0127f.mo553k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            eu0Var.m118140i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        eu0 eu0Var = this.f626a;
        if (eu0Var != null) {
            eu0Var.m118141j(mode);
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0121a();
        boolean mShowDropdown;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public static class C0121a implements Parcelable.Creator<SavedState> {
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
        this(context, attributeSet, n0c0.f136504M);
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
