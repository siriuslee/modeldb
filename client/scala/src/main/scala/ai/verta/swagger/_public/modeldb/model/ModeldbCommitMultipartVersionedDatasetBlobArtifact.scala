// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.modeldb.model

import scala.util.Try

import net.liftweb.json._

import ai.verta.swagger._public.modeldb.model.DatasetVisibilityEnumDatasetVisibility._
import ai.verta.swagger._public.modeldb.model.OperatorEnumOperator._
import ai.verta.swagger._public.modeldb.model.PathLocationTypeEnumPathLocationType._
import ai.verta.swagger._public.modeldb.model.ProtobufNullValue._
import ai.verta.swagger._public.modeldb.model.ValueTypeEnumValueType._
import ai.verta.swagger.client.objects._

case class ModeldbCommitMultipartVersionedDatasetBlobArtifact (
  dataset_id: Option[String] = None,
  dataset_version_id: Option[String] = None,
  path_dataset_component_blob_path: Option[String] = None
) extends BaseSwagger {
  def toJson(): JValue = ModeldbCommitMultipartVersionedDatasetBlobArtifact.toJson(this)
}

object ModeldbCommitMultipartVersionedDatasetBlobArtifact {
  def toJson(obj: ModeldbCommitMultipartVersionedDatasetBlobArtifact): JObject = {
    new JObject(
      List[Option[JField]](
        obj.dataset_id.map(x => JField("dataset_id", JString(x))),
        obj.dataset_version_id.map(x => JField("dataset_version_id", JString(x))),
        obj.path_dataset_component_blob_path.map(x => JField("path_dataset_component_blob_path", JString(x)))
      ).flatMap(x => x match {
        case Some(y) => List(y)
        case None => Nil
      })
    )
  }

  def fromJson(value: JValue): ModeldbCommitMultipartVersionedDatasetBlobArtifact =
    value match {
      case JObject(fields) => {
        val fieldsMap = fields.map(f => (f.name, f.value)).toMap
        ModeldbCommitMultipartVersionedDatasetBlobArtifact(
          // TODO: handle required
          dataset_id = fieldsMap.get("dataset_id").map(JsonConverter.fromJsonString),
          dataset_version_id = fieldsMap.get("dataset_version_id").map(JsonConverter.fromJsonString),
          path_dataset_component_blob_path = fieldsMap.get("path_dataset_component_blob_path").map(JsonConverter.fromJsonString)
        )
      }
      case _ => throw new IllegalArgumentException(s"unknown type ${value.getClass.toString}")
    }
}
