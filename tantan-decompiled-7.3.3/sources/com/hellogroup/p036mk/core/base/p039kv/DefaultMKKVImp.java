package com.hellogroup.p036mk.core.base.p039kv;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jzv;
import p153l.lv0;
import p153l.oxl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m88121d2 = {"Lcom/hellogroup/mk/core/base/kv/DefaultMKKVImp;", "Ll/oxl;", "<init>", "()V", "", Constants.KEY_KEY, "defaultValue", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Z)Z", "value", "e", "(Ljava/lang/String;Ljava/lang/String;)Z", "c", "", "f", "(Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", "g", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Companion", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class DefaultMKKVImp implements oxl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy sharedPreferences = LazyKt__LazyJVMKt.m88118b(new Function0<SharedPreferences>() { // from class: com.hellogroup.mk.core.base.kv.DefaultMKKVImp$sharedPreferences$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return lv0.m155971a().getSharedPreferences("sp_mk_core_cache", 0);
        }
    });

    /* JADX INFO: renamed from: g */
    private final SharedPreferences m18377g() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: a */
    public boolean mo18378a(@Nullable String key) {
        if (key == null || StringsKt.m94329e0(key)) {
            jzv.m147734g("DefaultMKKVImp", "containSysKey: key is null or blank");
            return false;
        }
        try {
            return m18377g().contains(key);
        } catch (Exception e) {
            jzv.m147729b("DefaultMKKVImp", "containSysKey: error checking key: " + key + ", error: " + e.getMessage());
            return false;
        }
    }

    @Override // p153l.oxl
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo18379b(@Nullable String key, @Nullable String defaultValue) {
        if (key == null || StringsKt.m94329e0(key)) {
            jzv.m147734g("DefaultMKKVImp", "getSysStr: key is null or blank");
            return defaultValue != null ? defaultValue : "";
        }
        try {
            String string = m18377g().getString(key, defaultValue);
            if (string != null) {
                defaultValue = string;
            }
            return defaultValue != null ? defaultValue : "";
        } catch (Exception e) {
            jzv.m147729b("DefaultMKKVImp", "getSysStr: error getting value for key: " + key + ", error: " + e.getMessage());
            return defaultValue != null ? defaultValue : "";
        }
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: c */
    public boolean mo18380c(@Nullable String key, boolean value) {
        if (key == null || StringsKt.m94329e0(key)) {
            jzv.m147734g("DefaultMKKVImp", "saveSysValue(Boolean): key is null or blank");
            return false;
        }
        try {
            SharedPreferences.Editor editorEdit = m18377g().edit();
            editorEdit.putBoolean(key, value);
            editorEdit.apply();
            return true;
        } catch (Exception e) {
            jzv.m147729b("DefaultMKKVImp", "saveSysValue(Boolean): error saving value for key: " + key + ", error: " + e.getMessage());
            return false;
        }
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: d */
    public boolean mo18381d(@Nullable String key, boolean defaultValue) {
        if (key == null || StringsKt.m94329e0(key)) {
            jzv.m147734g("DefaultMKKVImp", "getSysBool: key is null or blank");
            return defaultValue;
        }
        try {
            return m18377g().getBoolean(key, defaultValue);
        } catch (Exception e) {
            jzv.m147729b("DefaultMKKVImp", "getSysBool: error getting value for key: " + key + ", error: " + e.getMessage());
            return defaultValue;
        }
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: e */
    public boolean mo18382e(@Nullable String key, @Nullable String value) {
        if (key == null || StringsKt.m94329e0(key)) {
            jzv.m147734g("DefaultMKKVImp", "saveSysValue(String): key is null or blank");
            return false;
        }
        try {
            SharedPreferences.Editor editorEdit = m18377g().edit();
            editorEdit.putString(key, value);
            editorEdit.apply();
            return true;
        } catch (Exception e) {
            jzv.m147729b("DefaultMKKVImp", "saveSysValue(String): error saving value for key: " + key + ", error: " + e.getMessage());
            return false;
        }
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: f */
    public void mo18383f(@Nullable String key) {
        if (key == null || StringsKt.m94329e0(key)) {
            jzv.m147734g("DefaultMKKVImp", "removeSysValue: key is null or blank");
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = m18377g().edit();
            editorEdit.remove(key);
            editorEdit.apply();
        } catch (Exception e) {
            jzv.m147729b("DefaultMKKVImp", "removeSysValue: error removing value for key: " + key + ", error: " + e.getMessage());
        }
    }
}
