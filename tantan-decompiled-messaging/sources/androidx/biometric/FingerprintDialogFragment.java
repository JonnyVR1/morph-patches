package androidx.biometric;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.DialogInterfaceC0074a;
import androidx.fragment.app.DialogFragment;
import p149l.d1c0;
import p149l.e16;
import p149l.g6c0;
import p149l.i4c0;
import p149l.l3c0;
import p149l.uek0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SyntheticAccessor"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FingerprintDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: A */
    public Bundle f870A;

    /* JADX INFO: renamed from: B */
    public int f871B;

    /* JADX INFO: renamed from: C */
    public int f872C;

    /* JADX INFO: renamed from: D */
    public int f873D;

    /* JADX INFO: renamed from: E */
    public ImageView f874E;

    /* JADX INFO: renamed from: F */
    public TextView f875F;

    /* JADX INFO: renamed from: G */
    public Context f876G;

    /* JADX INFO: renamed from: I */
    @VisibleForTesting
    public DialogInterface.OnClickListener f878I;

    /* JADX INFO: renamed from: z */
    public HandlerC0179d f880z = new HandlerC0179d();

    /* JADX INFO: renamed from: H */
    public boolean f877H = true;

    /* JADX INFO: renamed from: J */
    public final DialogInterface.OnClickListener f879J = new DialogInterfaceOnClickListenerC0176a();

    /* JADX INFO: renamed from: androidx.biometric.FingerprintDialogFragment$a */
    public class DialogInterfaceOnClickListenerC0176a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: androidx.biometric.FingerprintDialogFragment$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DialogInterface f882a;

            public a(DialogInterface dialogInterface) {
                this.f882a = dialogInterface;
            }

            @Override // java.lang.Runnable
            public void run() {
                FingerprintDialogFragment.this.onCancel(this.f882a);
            }
        }

        public DialogInterfaceOnClickListenerC0176a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                uek0.m193261e("FingerprintDialogFrag", FingerprintDialogFragment.this.getActivity(), FingerprintDialogFragment.this.f870A, new a(dialogInterface));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.FingerprintDialogFragment$b */
    public class DialogInterfaceOnClickListenerC0177b implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0177b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            boolean zM742o4 = FingerprintDialogFragment.this.m742o4();
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            if (zM742o4) {
                fingerprintDialogFragment.f879J.onClick(dialogInterface, i);
                return;
            }
            DialogInterface.OnClickListener onClickListener = fingerprintDialogFragment.f878I;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.FingerprintDialogFragment$c */
    public class RunnableC0178c implements Runnable {
        public RunnableC0178c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment.this.m745e4();
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.FingerprintDialogFragment$d */
    public final class HandlerC0179d extends Handler {
        public HandlerC0179d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    FingerprintDialogFragment.this.m753n4((CharSequence) message.obj);
                    break;
                case 2:
                    FingerprintDialogFragment.this.m752m4((CharSequence) message.obj);
                    break;
                case 3:
                    FingerprintDialogFragment.this.m750k4((CharSequence) message.obj);
                    break;
                case 4:
                    FingerprintDialogFragment.this.m751l4();
                    break;
                case 5:
                    FingerprintDialogFragment.this.m745e4();
                    break;
                case 6:
                    Context context = FingerprintDialogFragment.this.getContext();
                    FingerprintDialogFragment.this.f877H = context != null && uek0.m193263g(context, Build.MODEL);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static int m741h4(Context context) {
        return (context == null || !uek0.m193263g(context, Build.MODEL)) ? 2000 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public boolean m742o4() {
        return this.f870A.getBoolean("allow_device_credential");
    }

    /* JADX INFO: renamed from: p4 */
    public static FingerprintDialogFragment m743p4() {
        return new FingerprintDialogFragment();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m744d4(CharSequence charSequence) {
        TextView textView = this.f875F;
        if (textView != null) {
            textView.setTextColor(this.f871B);
            TextView textView2 = this.f875F;
            if (charSequence != null) {
                textView2.setText(charSequence);
            } else {
                textView2.setText(R$string.f913f);
            }
        }
        this.f880z.postDelayed(new RunnableC0178c(), m741h4(this.f876G));
    }

    /* JADX INFO: renamed from: e4 */
    public void m745e4() {
        if (getFragmentManager() == null) {
            Log.e("FingerprintDialogFrag", "Failed to dismiss fingerprint dialog fragment. Fragment manager was null.");
        } else {
            dismissAllowingStateLoss();
        }
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: f4 */
    public final Drawable m746f4(int i, int i2) {
        int i3;
        if (i == 0 && i2 == 1) {
            i3 = l3c0.f125869b;
        } else if (i == 1 && i2 == 2) {
            i3 = l3c0.f125869b;
        } else if (i == 2 && i2 == 1) {
            i3 = l3c0.f125868a;
        } else {
            if (i != 1 || i2 != 3) {
                return null;
            }
            i3 = l3c0.f125868a;
        }
        return this.f876G.getDrawable(i3);
    }

    /* JADX INFO: renamed from: g4 */
    public Handler m747g4() {
        return this.f880z;
    }

    @Nullable
    /* JADX INFO: renamed from: i4 */
    public CharSequence m748i4() {
        return this.f870A.getCharSequence("negative_text");
    }

    /* JADX INFO: renamed from: j4 */
    public final int m749j4(int i) {
        TypedValue typedValue = new TypedValue();
        this.f876G.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = getActivity().obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m750k4(CharSequence charSequence) {
        if (this.f877H) {
            m745e4();
        } else {
            m744d4(charSequence);
        }
        this.f877H = true;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m751l4() {
        m757t4(1);
        TextView textView = this.f875F;
        if (textView != null) {
            textView.setTextColor(this.f872C);
            this.f875F.setText(this.f876G.getString(R$string.f910c));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m752m4(CharSequence charSequence) {
        m757t4(2);
        this.f880z.removeMessages(4);
        TextView textView = this.f875F;
        if (textView != null) {
            textView.setTextColor(this.f871B);
            this.f875F.setText(charSequence);
        }
        HandlerC0179d handlerC0179d = this.f880z;
        handlerC0179d.sendMessageDelayed(handlerC0179d.obtainMessage(3), m741h4(this.f876G));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m753n4(CharSequence charSequence) {
        m757t4(2);
        this.f880z.removeMessages(4);
        TextView textView = this.f875F;
        if (textView != null) {
            textView.setTextColor(this.f871B);
            this.f875F.setText(charSequence);
        }
        HandlerC0179d handlerC0179d = this.f880z;
        handlerC0179d.sendMessageDelayed(handlerC0179d.obtainMessage(4), 2000L);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        FingerprintHelperFragment fingerprintHelperFragment = (FingerprintHelperFragment) getFragmentManager().m2557i0("FingerprintHelperFragment");
        if (fingerprintHelperFragment != null) {
            fingerprintHelperFragment.m768b4(1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f876G = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f871B = m749j4(R.attr.colorError);
        } else {
            this.f871B = e16.m114375c(context, d1c0.f83258a);
        }
        this.f872C = m749j4(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (bundle != null && this.f870A == null) {
            this.f870A = bundle.getBundle("SavedBundle");
        }
        DialogInterfaceC0074a.a aVar = new DialogInterfaceC0074a.a(getContext());
        aVar.setTitle(this.f870A.getCharSequence("title"));
        View viewInflate = LayoutInflater.from(aVar.getContext()).inflate(g6c0.f101244b, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(i4c0.f111426d);
        TextView textView2 = (TextView) viewInflate.findViewById(i4c0.f111423a);
        CharSequence charSequence = this.f870A.getCharSequence("subtitle");
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
        CharSequence charSequence2 = this.f870A.getCharSequence("description");
        if (TextUtils.isEmpty(charSequence2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(charSequence2);
        }
        this.f874E = (ImageView) viewInflate.findViewById(i4c0.f111425c);
        this.f875F = (TextView) viewInflate.findViewById(i4c0.f111424b);
        aVar.setNegativeButton(m742o4() ? getString(R$string.f908a) : this.f870A.getCharSequence("negative_text"), new DialogInterfaceOnClickListenerC0177b());
        aVar.setView(viewInflate);
        DialogInterfaceC0074a dialogInterfaceC0074aCreate = aVar.create();
        dialogInterfaceC0074aCreate.setCanceledOnTouchOutside(false);
        return dialogInterfaceC0074aCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f880z.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f873D = 0;
        m757t4(1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("SavedBundle", this.f870A);
    }

    /* JADX INFO: renamed from: q4 */
    public void m754q4(@NonNull Bundle bundle) {
        this.f870A = bundle;
    }

    /* JADX INFO: renamed from: r4 */
    public void m755r4(DialogInterface.OnClickListener onClickListener) {
        this.f878I = onClickListener;
    }

    /* JADX INFO: renamed from: s4 */
    public final boolean m756s4(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m757t4(int i) {
        Drawable drawableM746f4;
        if (this.f874E == null || (drawableM746f4 = m746f4(this.f873D, i)) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = drawableM746f4 instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawableM746f4 : null;
        this.f874E.setImageDrawable(drawableM746f4);
        if (animatedVectorDrawable != null && m756s4(this.f873D, i)) {
            animatedVectorDrawable.start();
        }
        this.f873D = i;
    }
}
