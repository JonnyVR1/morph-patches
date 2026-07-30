package com.momo.xeengine.svgaplayer.utils;

import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0015\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/utils/SafeKit;", "", "()V", "parseColor", "", "color", "", "defaultColor", "(Ljava/lang/String;Ljava/lang/Integer;)I", "parseStrToInt", "count", "parseUri", "Landroid/net/Uri;", "url", "valueOfInt", "(Ljava/lang/Integer;)I", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
public final class SafeKit {
    public static final SafeKit INSTANCE = new SafeKit();

    private SafeKit() {
    }

    @JvmStatic
    @Nullable
    public static final Uri parseUri(@Nullable String url) {
        if (url != null) {
            try {
                return Uri.parse(url);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final int parseColor(@Nullable String color, @Nullable Integer defaultColor) {
        if (color != null) {
            try {
                return C15493d.m94374J(color, "#", false, 2, null) ? Color.parseColor(color) : Color.parseColor("#".concat(color));
            } catch (Exception e) {
                Log.getStackTraceString(e);
            }
        }
        if (defaultColor != null) {
            return defaultColor.intValue();
        }
        return 0;
    }

    public final int parseStrToInt(@Nullable String count) {
        if (count == null) {
            return 0;
        }
        try {
            Integer numValueOf = Integer.valueOf(count);
            numValueOf.getClass();
            return numValueOf.intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int valueOfInt(@Nullable Integer count) {
        if (count == null) {
            return 0;
        }
        try {
            return count.intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    @JvmStatic
    public static final int parseColor(@Nullable String color) {
        return INSTANCE.parseColor(color, 0);
    }
}
