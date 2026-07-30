package com.p000p1.mobile.putong.host;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class HostTestHelper {
    public static final String TEST_ACT_FAIL = "activity 加载失败";
    public static final String TEST_ACT_SUCCESS = "activity 加载成功";
    private static final String TEST_DESC = "%s执行结果%s符合预期，期望结果是%s，实际结果是%s";
    public static final String TEST_FAIL = "验证失败";
    private static final String TEST_FAIL_REASON_VERSION = "插件版本不符合要求，预期插件版本 core:1 feed:1，当前插件版本 core:%s feed:%s";
    public static final String TEST_MANUAL = "手动验证";
    public static final String TEST_SUCCESS = "验证通过";

    public static native String getText();
}
