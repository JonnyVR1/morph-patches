package com.p000p1.mobile.putong.core.p002ui.intloperation.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p002ui.intloperation.common.SelectorView;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.gee0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH$¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0019\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR2\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R.\u0010?\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R6\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010H\u001a\u0004\bA\u0010I\"\u0004\bJ\u0010\u0010¨\u0006L"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/common/SelectorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isSelect", "", "g", "(Z)V", "select", "h", "onDetachedFromWindow", "()V", "hashCode", "()I", "d", "Ljava/io/Closeable;", "closable", "e", "(Ljava/io/Closeable;)V", "Ljava/util/HashMap;", "", "a", "Ljava/util/HashMap;", "getTags", "()Ljava/util/HashMap;", "setTags", "(Ljava/util/HashMap;)V", "tags", "", "b", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "tag", "c", "getGroupTag", "setGroupTag", "groupTag", "Ll/gee0;", "Ll/gee0;", "getGroup", "()Ll/gee0;", "setGroup", "(Ll/gee0;)V", "group", "Landroid/view/View;", "value", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "contentView", "Lkotlin/Function2;", "f", "Lkotlin/jvm/functions/Function2;", "getOnSelectChange", "()Lkotlin/jvm/functions/Function2;", "setOnSelectChange", "(Lkotlin/jvm/functions/Function2;)V", "onSelectChange", "Z", "()Z", "setSelecting", "isSelecting", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public abstract class SelectorView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public HashMap<Object, Closeable> tags;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String groupTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public gee0 group;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public View contentView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function2<? super SelectorView, ? super Boolean, Unit> onSelectChange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isSelecting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.tags = new HashMap<>();
        this.tag = "default tag-" + UUID.randomUUID();
        this.groupTag = "default group tag";
        View view = this.contentView;
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            setOnClickListener(new View.OnClickListener() { // from class: l.hee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SelectorView.m8380b(this.f14018a, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8380b(SelectorView selectorView, View view) {
        gee0 gee0Var = selectorView.group;
        if (gee0Var != null) {
            gee0Var.m14926g(selectorView);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8381c(SelectorView selectorView, View view) {
        gee0 gee0Var = selectorView.group;
        if (gee0Var != null) {
            gee0Var.m14926g(selectorView);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8382d() {
        gee0 gee0Var = this.group;
        if (gee0Var != null) {
            gee0Var.m14923d(this);
        }
        Iterator<Map.Entry<Object, Closeable>> it = this.tags.entrySet().iterator();
        while (it.hasNext()) {
            m8383e(it.next().getValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8383e(Closeable closable) {
        if (closable != null) {
            try {
                closable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSelecting() {
        return this.isSelecting;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo8339g(boolean isSelect);

    @Nullable
    public final View getContentView() {
        return this.contentView;
    }

    @Nullable
    public final gee0 getGroup() {
        return this.group;
    }

    @NotNull
    public final String getGroupTag() {
        return this.groupTag;
    }

    @Nullable
    public final Function2<SelectorView, Boolean, Unit> getOnSelectChange() {
        return this.onSelectChange;
    }

    @Override // android.view.View
    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final HashMap<Object, Closeable> getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: h */
    public final void m8385h(boolean select) {
        if (this.isSelecting != select) {
            Function2<? super SelectorView, ? super Boolean, Unit> function2 = this.onSelectChange;
            if (function2 != null) {
                function2.invoke(this, Boolean.valueOf(select));
            }
            mo8339g(select);
        }
        this.isSelecting = select;
    }

    public int hashCode() {
        String str = this.tag;
        if (str == null || str.length() == 0) {
            return 1544803905;
        }
        return this.tag.hashCode();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m8382d();
    }

    public final void setContentView(@Nullable View view) {
        this.contentView = view;
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            setOnClickListener(new View.OnClickListener() { // from class: l.iee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SelectorView.m8381c(this.f14593a, view2);
                }
            });
        }
    }

    public final void setGroup(@Nullable gee0 gee0Var) {
        this.group = gee0Var;
    }

    public final void setGroupTag(@NotNull String str) {
        str.getClass();
        this.groupTag = str;
    }

    public final void setOnSelectChange(@Nullable Function2<? super SelectorView, ? super Boolean, Unit> function2) {
        this.onSelectChange = function2;
    }

    public final void setSelecting(boolean z) {
        this.isSelecting = z;
    }

    public final void setTag(@NotNull String str) {
        str.getClass();
        this.tag = str;
    }

    public final void setTags(@NotNull HashMap<Object, Closeable> map) {
        map.getClass();
        this.tags = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.tags = new HashMap<>();
        this.tag = "default tag-" + UUID.randomUUID();
        this.groupTag = "default group tag";
        View view = this.contentView;
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            setOnClickListener(new View.OnClickListener() { // from class: l.hee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SelectorView.m8380b(this.f14018a, view2);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.tags = new HashMap<>();
        this.tag = "default tag-" + UUID.randomUUID();
        this.groupTag = "default group tag";
        View view = this.contentView;
        if (view != null) {
            addView(view, new FrameLayout.LayoutParams(-1, -1));
            setOnClickListener(new View.OnClickListener() { // from class: l.hee0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SelectorView.m8380b(this.f14018a, view2);
                }
            });
        }
    }
}
