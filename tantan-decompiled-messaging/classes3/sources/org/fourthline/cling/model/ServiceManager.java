package org.fourthline.cling.model;

import java.beans.PropertyChangeSupport;
import java.util.Collection;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.state.StateVariableValue;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ServiceManager<T> {
    public static final String EVENTED_STATE_VARIABLES = "_EventedStateVariables";

    void execute(Command<T> command) throws Exception;

    Collection<StateVariableValue> getCurrentState() throws Exception;

    T getImplementation();

    PropertyChangeSupport getPropertyChangeSupport();

    LocalService<T> getService();
}
