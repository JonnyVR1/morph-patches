package p149l;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/qb5;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Ll/qb5$a;", "b", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Ll/qb5$a;", "Landroid/widget/AdapterView;", "Ll/qb5$b;", "c", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)Ll/qb5$b;", "", Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "Landroid/os/Bundle;", "parameters", "e", "(Landroid/os/Bundle;)V", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class qb5 {

    @NotNull
    public static final qb5 INSTANCE = new qb5();

    /* JADX INFO: renamed from: l.qb5$a */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/qb5$a;", "Landroid/view/View$OnClickListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", OMSTemplateModeType.view, "", "onClick", "(Landroid/view/View;)V", "a", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "c", Constants.INAPP_DATA_TAG, "Landroid/view/View$OnClickListener;", "existingOnClickListener", "", "e", "Z", "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class ViewOnClickListenerC19456a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public EventBinding mapping;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public WeakReference<View> hostView;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public WeakReference<View> rootView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public View.OnClickListener existingOnClickListener;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean supportCodelessLogging;

        public ViewOnClickListenerC19456a(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull View view2) {
            eventBinding.getClass();
            view.getClass();
            view2.getClass();
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            this.existingOnClickListener = ccl0.m106069g(view2);
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                view.getClass();
                View.OnClickListener onClickListener = this.existingOnClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.rootView.get();
                View view3 = this.hostView.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                EventBinding eventBinding = this.mapping;
                eventBinding.getClass();
                qb5.m173816d(eventBinding, view2, view3);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: l.qb5$b */
    @Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0013\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/qb5$b;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "Landroid/widget/AdapterView;", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)V", "parent", OMSTemplateModeType.view, "", "position", "", "id", "", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "a", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "c", Constants.INAPP_DATA_TAG, "Landroid/widget/AdapterView$OnItemClickListener;", "existingOnItemClickListener", "", "e", "Z", "()Z", "setSupportCodelessLogging", "(Z)V", "supportCodelessLogging", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C19457b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public EventBinding mapping;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public WeakReference<AdapterView<?>> hostView;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public WeakReference<View> rootView;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public AdapterView.OnItemClickListener existingOnItemClickListener;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean supportCodelessLogging;

        public C19457b(@NotNull EventBinding eventBinding, @NotNull View view, @NotNull AdapterView<?> adapterView) {
            eventBinding.getClass();
            view.getClass();
            adapterView.getClass();
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(adapterView);
            this.rootView = new WeakReference<>(view);
            this.existingOnItemClickListener = adapterView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(@Nullable AdapterView<?> parent, @NotNull View view, int position, long id) {
            view.getClass();
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(parent, view, position, id);
            }
            View view2 = this.rootView.get();
            AdapterView<?> adapterView = this.hostView.get();
            if (view2 == null || adapterView == null) {
                return;
            }
            qb5.m173816d(this.mapping, view2, adapterView);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m173813a(String str, Bundle bundle) {
        if (lsb.m151554d(qb5.class)) {
            return;
        }
        try {
            str.getClass();
            bundle.getClass();
            AppEventsLogger.INSTANCE.m7652g(C1577c.m8047l()).m7645d(str, bundle);
        } catch (Throwable th) {
            lsb.m151552b(th, qb5.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ViewOnClickListenerC19456a m173814b(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
        if (lsb.m151554d(qb5.class)) {
            return null;
        }
        try {
            mapping.getClass();
            rootView.getClass();
            hostView.getClass();
            return new ViewOnClickListenerC19456a(mapping, rootView, hostView);
        } catch (Throwable th) {
            lsb.m151552b(th, qb5.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C19457b m173815c(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull AdapterView<?> hostView) {
        if (lsb.m151554d(qb5.class)) {
            return null;
        }
        try {
            mapping.getClass();
            rootView.getClass();
            hostView.getClass();
            return new C19457b(mapping, rootView, hostView);
        } catch (Throwable th) {
            lsb.m151552b(th, qb5.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m173816d(@NotNull EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
        if (lsb.m151554d(qb5.class)) {
            return;
        }
        try {
            mapping.getClass();
            rootView.getClass();
            hostView.getClass();
            final String eventName = mapping.getEventName();
            final Bundle bundleM197693b = vb5.INSTANCE.m197693b(mapping, rootView, hostView);
            INSTANCE.m173817e(bundleM197693b);
            C1577c.m8056u().execute(new Runnable() { // from class: l.pb5
                @Override // java.lang.Runnable
                public final void run() {
                    qb5.m173813a(eventName, bundleM197693b);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, qb5.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m173817e(@NotNull Bundle parameters) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            parameters.getClass();
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", nv0.m161523f(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
