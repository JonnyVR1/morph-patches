package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Objects;
import p149l.jcr;
import p149l.ldl0;
import p149l.mdl0;
import p149l.n250;
import p149l.ndl0;
import p149l.qkq0;
import p149l.t2j;
import p149l.xjw;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @Nullable
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private n250<jcr> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$a */
    public class RunnableC0366a implements Runnable {
        public RunnableC0366a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogFragment.this.mOnDismissListener.onDismiss(DialogFragment.this.mDialog);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$b */
    public class DialogInterfaceOnCancelListenerC0367b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC0367b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@Nullable DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$c */
    public class DialogInterfaceOnDismissListenerC0368c implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC0368c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@Nullable DialogInterface dialogInterface) {
            if (DialogFragment.this.mDialog != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$d */
    public class C0369d implements n250<jcr> {
        public C0369d() {
        }

        @Override // p149l.n250
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(jcr jcrVar) {
            if (jcrVar == null || !DialogFragment.this.mShowsDialog) {
                return;
            }
            View viewRequireView = DialogFragment.this.requireView();
            if (viewRequireView.getParent() != null) {
                qkq0.m175383a("DialogFragment can not be attached to a container view");
            } else if (DialogFragment.this.mDialog != null) {
                if (FragmentManager.m2480G0(3)) {
                    toString();
                    Objects.toString(DialogFragment.this.mDialog);
                }
                DialogFragment.this.mDialog.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$e */
    public class C0370e extends t2j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ t2j f1835a;

        public C0370e(t2j t2jVar) {
            this.f1835a = t2jVar;
        }

        @Override // p149l.t2j
        @Nullable
        /* JADX INFO: renamed from: c */
        public View mo2458c(int i) {
            View viewOnFindViewById = DialogFragment.this.onFindViewById(i);
            if (viewOnFindViewById != null) {
                return viewOnFindViewById;
            }
            if (this.f1835a.mo2459d()) {
                return this.f1835a.mo2458c(i);
            }
            return null;
        }

        @Override // p149l.t2j
        /* JADX INFO: renamed from: d */
        public boolean mo2459d() {
            return DialogFragment.this.onHasView() || this.f1835a.mo2459d();
        }
    }

    public DialogFragment() {
        this.mDismissRunnable = new RunnableC0366a();
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC0367b();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC0368c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C0369d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z, boolean z2) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            getParentFragmentManager().m2533Y0(this.mBackStackId, 1);
            this.mBackStackId = -1;
            return;
        }
        AbstractC0427k abstractC0427kM2567m = getParentFragmentManager().m2567m();
        abstractC0427kM2567m.mo2715r(this);
        if (z) {
            abstractC0427kM2567m.mo2708j();
        } else {
            abstractC0427kM2567m.mo2707i();
        }
    }

    private void prepareDialog(@Nullable Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public t2j createFragmentContainer() {
        return new C0370e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    @Nullable
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @StyleRes
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m2984j(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @NonNull
    @MainThread
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (FragmentManager.m2480G0(3)) {
            toString();
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().mo2988n(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.m2480G0(3)) {
            toString();
        }
        dismissInternal(true, true);
    }

    @Nullable
    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.m2480G0(2)) {
                toString();
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.m2480G0(2)) {
            new StringBuilder("getting layout inflater for DialogFragment ").append(this);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            ldl0.m149447b(decorView, this);
            ndl0.m158994a(decorView, this);
            mdl0.m154103a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        xjw.m209754a("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, @StyleRes int i2) {
        if (FragmentManager.m2480G0(2)) {
            toString();
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(@NonNull AbstractC0427k abstractC0427k, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC0427k.m2806e(this, str);
        this.mViewDestroyed = false;
        int iMo2707i = abstractC0427k.mo2707i();
        this.mBackStackId = iMo2707i;
        return iMo2707i;
    }

    public void showNow(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC0427k abstractC0427kM2567m = fragmentManager.m2567m();
        abstractC0427kM2567m.m2806e(this, str);
        abstractC0427kM2567m.mo2709k();
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        AbstractC0427k abstractC0427kM2567m = fragmentManager.m2567m();
        abstractC0427kM2567m.m2806e(this, str);
        abstractC0427kM2567m.mo2707i();
    }

    public DialogFragment(@LayoutRes int i) {
        super(i);
        this.mDismissRunnable = new RunnableC0366a();
        this.mOnCancelListener = new DialogInterfaceOnCancelListenerC0367b();
        this.mOnDismissListener = new DialogInterfaceOnDismissListenerC0368c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C0369d();
        this.mDialogCreated = false;
    }
}
