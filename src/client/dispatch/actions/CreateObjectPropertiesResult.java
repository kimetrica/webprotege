package edu.stanford.bmir.protege.web.client.dispatch.actions;

import com.google.common.collect.ImmutableCollection;
import edu.stanford.bmir.protege.web.shared.annotations.GwtSerializationConstructor;
import edu.stanford.bmir.protege.web.shared.event.ProjectEvent;
import edu.stanford.bmir.protege.web.shared.events.EventList;
import edu.stanford.bmir.protege.web.shared.project.ProjectId;
import edu.stanford.protege.gwt.graphtree.shared.Path;
import org.semanticweb.owlapi.model.OWLObjectProperty;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 25/03/2013
 */
public class CreateObjectPropertiesResult extends CreateEntitiesInHierarchyResult<OWLObjectProperty> {

    public CreateObjectPropertiesResult(@Nonnull ProjectId projectId,
                                        @Nonnull ImmutableCollection<OWLObjectProperty> entities,
                                        EventList<ProjectEvent<?>> eventList) {
        super(projectId, entities, eventList);
    }

    @GwtSerializationConstructor
    private CreateObjectPropertiesResult() {
    }

}