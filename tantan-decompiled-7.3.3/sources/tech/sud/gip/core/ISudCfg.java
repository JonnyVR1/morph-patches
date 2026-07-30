package tech.sud.gip.core;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ISudCfg {
    public static final String ASR_LOAD_LIST = "asr_load_list";
    public static final String BLOCK_COMMON_GAME_RELOAD = "block_common_game_reload";
    public static final String DISABLE_AUDIO_FOCUS = "disable_audio_focus";
    public static final String KEYBOARD_BOTTOM_OFFSET = "keyboard_bottom_offset";
    public static final String PRIORITY_EMBEDDED_GAME_PKG = "priority_embedded_game_pkg";
    public static final String RUNTIME_3D_MULTIPROCESS = "runtime_3d_multiprocess";

    void addEmbeddedMGPkg(long j, String str);

    Map<String, String> getAdvancedConfigMap();

    String getEmbeddedMGPkgPath(long j);

    boolean getShowCustomLoading();

    boolean getShowLoadingGameBg();

    void removeEmbeddedMGPkg(long j);

    void setShowCustomLoading(boolean z);

    void setShowLoadingGameBg(boolean z);
}
