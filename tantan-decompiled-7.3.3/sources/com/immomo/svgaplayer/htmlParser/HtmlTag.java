package com.immomo.svgaplayer.htmlParser;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.util.ArrayMap;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C15493d;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.Attributes;
import p000.C0799b;
import p153l.p7f;
import p153l.wg3;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J+\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\t\u001a\u00020\u00152\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00140\fH\u0016¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012J1\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001d\"\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0001J\u001a\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\"H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, m88121d2 = {"Lcom/immomo/svgaplayer/htmlParser/HtmlTag;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "end", "", "text", "Landroid/text/Editable;", "kind", "Ljava/lang/Class;", "repl", "endHandleTag", "getHtmlColor", "", "colorString", "", "getLast", p7f.GPS_DIRECTION_TRUE, "Landroid/text/Spanned;", "(Landroid/text/Spanned;Ljava/lang/Class;)Ljava/lang/Object;", "parseHtmlColor", "colorStr", "setSpanFromMark", "Landroid/text/Spannable;", "mark", "spans", "", "(Landroid/text/Spannable;Ljava/lang/Object;[Ljava/lang/Object;)V", "start", "startHandleTag", "attributes", "Lorg/xml/sax/Attributes;", "Companion", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public abstract class HtmlTag {
    private static Map<String, Integer> sColorNameMap;

    @NotNull
    private final Context context;

    static {
        ArrayMap arrayMap = new ArrayMap();
        sColorNameMap = arrayMap;
        arrayMap.put("black", Integer.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR));
        sColorNameMap.put("darkgray", -12303292);
        sColorNameMap.put("gray", -7829368);
        sColorNameMap.put("lightgray", -3355444);
        sColorNameMap.put("white", -1);
        sColorNameMap.put("red", -65536);
        sColorNameMap.put("green", -16711936);
        sColorNameMap.put(LiveVoiceInternalEntryBean.TYPE_BG_STYLE_BLUE, -16776961);
        sColorNameMap.put("yellow", -256);
        sColorNameMap.put("cyan", -16711681);
        sColorNameMap.put("magenta", -65281);
        sColorNameMap.put("aqua", -16711681);
        sColorNameMap.put("fuchsia", -65281);
        sColorNameMap.put("darkgrey", -12303292);
        sColorNameMap.put("grey", -7829368);
        sColorNameMap.put("lightgrey", -3355444);
        sColorNameMap.put("lime", -16711936);
        sColorNameMap.put("maroon", -8388608);
        sColorNameMap.put("navy", -16777088);
        sColorNameMap.put("olive", -8355840);
        sColorNameMap.put("purple", -8388480);
        sColorNameMap.put("silver", -4144960);
        sColorNameMap.put("teal", -16744320);
        sColorNameMap.put("white", -1);
        sColorNameMap.put("transparent", 0);
    }

    public HtmlTag(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    private final void setSpanFromMark(Spannable text, Object mark, Object... spans) {
        int spanStart = text.getSpanStart(mark);
        text.removeSpan(mark);
        int length = text.length();
        if (spanStart != length) {
            for (Object obj : spans) {
                text.setSpan(obj, spanStart, length, 33);
            }
        }
    }

    public final void end(@NotNull Editable text, @NotNull Class<?> kind, @NotNull Object repl) {
        text.getClass();
        kind.getClass();
        repl.getClass();
        Object last = getLast(text, kind);
        if (last != null) {
            setSpanFromMark(text, last, repl);
        }
    }

    public abstract void endHandleTag(@NotNull Editable text);

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getHtmlColor(@NotNull String colorString) {
        Integer num;
        colorString.getClass();
        Map<String, Integer> map = sColorNameMap;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = colorString.toLowerCase(locale);
        lowerCase.getClass();
        if (map.containsKey(lowerCase) && (num = sColorNameMap.get(colorString)) != null) {
            return num.intValue();
        }
        locale.getClass();
        String lowerCase2 = colorString.toLowerCase(locale);
        lowerCase2.getClass();
        return parseHtmlColor(lowerCase2);
    }

    @Nullable
    public <T> T getLast(@NotNull Spanned text, @NotNull Class<T> kind) {
        text.getClass();
        kind.getClass();
        Object[] spans = text.getSpans(0, text.length(), kind);
        spans.getClass();
        if (spans.length == 0) {
            return null;
        }
        return (T) spans[spans.length - 1];
    }

    public final int parseHtmlColor(@NotNull String colorStr) {
        long jArgb;
        colorStr.getClass();
        if (colorStr.charAt(0) == '#') {
            if (colorStr.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                int length = colorStr.length();
                for (int i = 1; i < length; i++) {
                    char cCharAt = colorStr.charAt(i);
                    sb.append(cCharAt);
                    sb.append(cCharAt);
                }
                colorStr = sb.toString();
            }
            long j = Long.parseLong(colorStr.substring(1), CharsKt.checkRadix(16));
            int length2 = colorStr.length();
            if (length2 == 7) {
                jArgb = (-16777216) | j;
            } else {
                if (length2 != 9) {
                    wg3.m206174a("Unknown color");
                    return 0;
                }
                jArgb = Color.argb(Integer.parseInt(colorStr.substring(1, 3), CharsKt.checkRadix(16)), Integer.parseInt(colorStr.substring(3, 5), CharsKt.checkRadix(16)), Integer.parseInt(colorStr.substring(5, 7), CharsKt.checkRadix(16)), Integer.parseInt(colorStr.substring(7, 8), CharsKt.checkRadix(16)));
            }
            return (int) jArgb;
        }
        if (C15493d.m94374J(colorStr, "rgb(", false, 2, null) || (C15493d.m94374J(colorStr, "rgba(", false, 2, null) && C15493d.m94380w(colorStr, ")", false, 2, null))) {
            List<String> listSplit = new Regex(Constants.SEPARATOR_COMMA).split(new Regex(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replace(colorStr.substring(StringsKt.m94327c0(colorStr, "(", 0, false, 6, null), StringsKt.m94327c0(colorStr, ")", 0, false, 6, null)), ""), 0);
            if (listSplit == null) {
                C0799b.m4641a("null cannot be cast to non-null type java.util.Collection<T>");
                return 0;
            }
            Object[] array = listSplit.toArray(new String[0]);
            if (array == null) {
                C0799b.m4641a("null cannot be cast to non-null type kotlin.Array<T>");
                return 0;
            }
            String[] strArr = (String[]) array;
            if (strArr.length == 3) {
                return Color.argb(255, Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            }
            if (strArr.length == 4) {
                return Color.argb(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            }
        }
        wg3.m206174a("Unknown color");
        return 0;
    }

    public final void start(@NotNull Editable text, @NotNull Object mark) {
        text.getClass();
        mark.getClass();
        int length = text.length();
        text.setSpan(mark, length, length, 17);
    }

    public abstract void startHandleTag(@NotNull Editable text, @Nullable Attributes attributes);
}
