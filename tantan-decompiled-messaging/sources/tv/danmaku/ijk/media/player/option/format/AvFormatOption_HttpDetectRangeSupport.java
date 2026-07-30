package tv.danmaku.ijk.media.player.option.format;

import tv.danmaku.ijk.media.player.option.AvFormatOption;

/* JADX INFO: loaded from: classes3.dex */
public final class AvFormatOption_HttpDetectRangeSupport implements AvFormatOption {

    /* JADX INFO: renamed from: b */
    public static AvFormatOption_HttpDetectRangeSupport f207942b = new AvFormatOption_HttpDetectRangeSupport("1");

    /* JADX INFO: renamed from: c */
    public static AvFormatOption_HttpDetectRangeSupport f207943c = new AvFormatOption_HttpDetectRangeSupport("0");

    /* JADX INFO: renamed from: a */
    private final String f207944a;

    public AvFormatOption_HttpDetectRangeSupport(String str) {
        this.f207944a = str;
    }

    @Override // tv.danmaku.ijk.media.player.option.AvFormatOption
    public String getName() {
        return "http-detect-range-support";
    }

    @Override // tv.danmaku.ijk.media.player.option.AvFormatOption
    public String getValue() {
        return this.f207944a;
    }
}
